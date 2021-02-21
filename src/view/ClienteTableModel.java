package view;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Cliente;
public class ClienteTableModel extends AbstractTableModel{
    public static final int COL_CODIGO = 0;
    public static final int COL_NOME = 1;
    public static final int COL_DATANASCIMENTO = 2;
    public static final int COL_NACIONALIDADE = 3;
    public static final int COL_SEXO = 4;
    public static final int COL_ENDERECO = 5;

    public ArrayList<Cliente> listaClientes;
    public ClienteTableModel (ArrayList<Cliente> alCli){
       listaClientes = new ArrayList<Cliente>(alCli);
    }
    @Override
    public int getRowCount() {
       return listaClientes.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }
    
    @Override
    public Object getValueAt(int line, int col) {
        Cliente cliente = listaClientes.get(line);
        
        if(col == COL_CODIGO){return cliente.getCodCliente();}
        if(col == COL_NOME){return cliente.getNomeCliente();}
        if(col == COL_DATANASCIMENTO){return cliente.getDataNascCliente();}
        if(col == COL_NACIONALIDADE){return cliente.getNacionalidade();}
        if(col == COL_SEXO){return cliente.getSexo();}
        if(col == COL_ENDERECO){return cliente.getEndereco();}
        return "";
    }
    
    @Override
    public String getColumnName(int cols) {
        if(cols == COL_CODIGO){return "Código";}
        if(cols == COL_NOME){return "Nome";}
        if(cols == COL_DATANASCIMENTO){return "Data de Nascimento";}
        if(cols == COL_NACIONALIDADE){return "Nacionalidade";}
        if(cols == COL_SEXO){return "Sexo";}
        if(cols == COL_ENDERECO){return "Endereco";}
        return "";
    }
}
