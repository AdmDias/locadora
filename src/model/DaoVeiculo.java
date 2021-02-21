package model;

import java.sql.*;
import java.util.ArrayList;

public class DaoVeiculo {
    private Connection conn;
    private Statement st;

    private void conectar(){
        try{
            conn = GerenciadorConexao.pegarConexao();
            st = conn.createStatement();
        }catch(ClassNotFoundException e1){
            System.out.println(e1.getMessage());
        }catch(SQLException e2){
            System.out.println(e2.getMessage());
        }
    }

    private void desconectar(){
        try{
            st.close();
            conn.close();
        }catch(SQLException e){
            System.out.println("Erro ao fechar a conexao: " + e.getMessage());
        }
    }

    public boolean inserir(Veiculo v){
        boolean resultado = false;
        try{
                conectar();
                String comando = "INSERT INTO tbveiculos VALUES (NULL, '"
                        + v.getMarca() + "', '" + v.getModelo() + "', '"
                        + v.getChassi() + "', " + v.getAno() + ");";

                //System.out.println("SQL: " + comando);

                st.executeUpdate(comando);
                resultado = true;
        }catch(SQLException e){
                System.out.println("Erro ao inserir o registro: " + e.getMessage());
        }finally{
                desconectar();
        }
        return resultado;
    }

    public ArrayList<Veiculo> buscarTodos(){
        ArrayList<Veiculo> resultados = new ArrayList<Veiculo>();
        try{
                conectar();
                ResultSet rs = st.executeQuery("select * from tbveiculos order by modelo;");
                while(rs.next()){
                        Veiculo v = new Veiculo();
                        v.setCodigo(rs.getInt("codigo"));
                        v.setMarca(rs.getString("marca"));
                        v.setModelo(rs.getString("modelo"));
                        v.setChassi(rs.getString("chassi"));
                        v.setAno(rs.getInt("ano"));

                        resultados.add(v);
                }
                
        }catch(SQLException e){
                System.out.println("Erro: " + e.getMessage());
        }finally{
                desconectar();
        }
        return resultados;
    }
    
     public ArrayList<Veiculo> busca_comFiltro(String campo, String filtro){
        ArrayList<Veiculo> result = new ArrayList<Veiculo>();
        
        if(!campo.equals("marca") && !campo.equals("modelo")){
            return result;
        }
        try{
            conectar();
            String comando = "select * from tbveiculos where "+ campo +" like '%"+ filtro +"%';";
            ResultSet rs = st.executeQuery(comando);
            while(rs.next()){
                    Veiculo v = new Veiculo();
                    v.setCodigo(rs.getInt("codigo"));
                    v.setMarca(rs.getString("marca"));
                    v.setModelo(rs.getString("modelo"));
                    v.setChassi(rs.getString("chassi"));
                    v.setAno(rs.getInt("ano"));

                    result.add(v);
                    
            }
        }catch(SQLException e){
                System.out.println("Erro: " + e.getMessage());
        }finally{
                desconectar();
        }
        return result;
    }
     
    public int excluir(int cod){
        int qtde = 0;
        try{
            conectar();
            String comando = "delete from tbveiculos where codigo = " + cod + ";";
            st.executeUpdate(comando);
            qtde = st.getUpdateCount();//mostra quantos registros foram afetados no BD
        }catch(SQLException e){
                System.out.println("Erro: " + e.getMessage());
        }finally{
                desconectar();
        }		
        return qtde;
    }

    public Veiculo consultar(int cod){
        Veiculo v = null;
        try{
            conectar();
            String comando = "select * from tbveiculos where codigo = " + cod + ";";
            ResultSet rs = st.executeQuery(comando);
            if(rs.next()){
                    v = new Veiculo();
                    v.setCodigo(rs.getInt("codigo"));
                    v.setMarca(rs.getString("marca"));
                    v.setModelo(rs.getString("modelo"));
                    v.setChassi(rs.getString("chassi"));
                    v.setAno(rs.getInt("ano"));
            }
        }catch(SQLException e){
                System.out.println("Erro: " + e.getMessage());
        }finally{
                desconectar();
        }		
        return v;		
    }

    public int alterar(Veiculo v){
        int qtde = 0;
        try {
                conectar();  
                String comando = "UPDATE  tbveiculos SET marca = '" + v.getMarca()
                        + "', modelo = '" + v.getModelo() + "', chassi = '" + v.getChassi() 
                        + "', ano = " + v.getAno() + " WHERE codigo = " + v.getCodigo() + ";";  
                st.executeUpdate(comando);  
                qtde = st.getUpdateCount();
        } catch (SQLException e) {  
                System.out.println("Erro ao atualizar:" + e.getMessage());  
        } finally {  
                desconectar();  
        }  
        return qtde;
    }		
}





