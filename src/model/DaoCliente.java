package model;

import java.sql.*;
import java.util.ArrayList;

public class DaoCliente {
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
    
    public boolean inserir(Cliente c) {
        boolean resultado = false;
        try {
            conectar();
            String sql = "INSERT INTO tbclientes VALUES (NULL, '"
                            + c.getNomeCliente() + "', '"
                            + c.getDataNascCliente() + "', '"
                            + c.getNacionalidade() + "', '"
                            + c.getSexo() + "', '"
                            + c.getEndereco() + "');";

            st.executeUpdate(sql);
            resultado = true;

        }catch(SQLException e) {
                System.out.println("Erro ao inserir o registro: " + e.getMessage());
        }finally {
                desconectar();
        }
        return resultado;
    }
    
    public ArrayList<Cliente> buscarTodos(){
        ArrayList<Cliente> resultados = new ArrayList<Cliente>();
        try{
                conectar();
                ResultSet rs = st.executeQuery("select * from tbclientes order by nomeCliente;");
                while(rs.next()){
                        Cliente c = new Cliente();
                        c.setCodCliente(rs.getInt("codCliente"));
                        c.setNomeCliente(rs.getString("nomeCliente"));
                        c.setDataNascCliente(rs.getString("dataNascCliente"));
                        c.setNacionalidade(rs.getString("nacionalidade"));
                        c.setSexo(rs.getString("sexo"));
                        c.setEndereco(rs.getString("endereco"));

                        resultados.add(c);
                }
                
        }catch(SQLException e){
                System.out.println("Erro: " + e.getMessage());
        }finally{
                desconectar();
        }
        return resultados;
    }
    
     public ArrayList<Cliente> busca_comFiltro(String campo, String filtro){
        ArrayList<Cliente> result = new ArrayList<Cliente>();
        
        if(!campo.equals("nomeCliente") && !campo.equals("endereco")){
            return result;
        }
        try{
            conectar();
            String comando = "select * from tbclientes where "+ campo +" like '%"+ filtro +"%';";
            ResultSet rs = st.executeQuery(comando);
            while(rs.next()){
                    Cliente c = new Cliente();
                    c.setCodCliente(rs.getInt("codCliente"));
                    c.setNomeCliente(rs.getString("nomeCliente"));
                    c.setDataNascCliente(rs.getString("dataNascCliente"));
                    c.setNacionalidade(rs.getString("nacionalidade"));
                    c.setSexo(rs.getString("sexo"));
                    c.setEndereco(rs.getString("endereco"));

                    result.add(c);
                    
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
            String comando = "delete from tbclientes where codCliente = " + cod + ";";
            st.executeUpdate(comando);
            qtde = st.getUpdateCount();//mostra quantos registros foram afetados no BD
        }catch(SQLException e){
                System.out.println("Erro: " + e.getMessage());
        }finally{
                desconectar();
        }		
        return qtde;
    }

    public Cliente consultar(int cod){
        Cliente c = null;
        try{
            conectar();
            String comando = "select * from tbclientes where codCliente = " + cod + ";";
            ResultSet rs = st.executeQuery(comando);
            if(rs.next()){
                    c = new Cliente();
                    c.setCodCliente(rs.getInt("codCliente"));
                    c.setNomeCliente(rs.getString("nomeCliente"));
                    c.setDataNascCliente(rs.getString("dataNascCliente"));
                    c.setNacionalidade(rs.getString("nacionalidade"));
                    c.setSexo(rs.getString("sexo"));
                    c.setEndereco(rs.getString("endereco"));
            }
        }catch(SQLException e){
                System.out.println("Erro: " + e.getMessage());
        }finally{
                desconectar();
        }		
        return c;		
    }

    public int alterar(Cliente c){
        int qtde = 0;
        try {
            conectar();  
            String comando = "UPDATE  tbclientes SET nomeCliente = '" + c.getNomeCliente()
                + "', dataNascCliente = '" + c.getDataNascCliente() + "', nacionalidade = '" + c.getNacionalidade() 
                + "', sexo = '" + c.getSexo() + "', endereco = '" + c.getEndereco() + "' WHERE codCliente = " + c.getCodCliente() + ";";  
            
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
