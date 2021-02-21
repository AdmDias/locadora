package view;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Veiculo;

public class VeiculoTableModel extends AbstractTableModel{
    public static final int COL_CODIGO = 0;
    public static final int COL_MARCA = 1;
    public static final int COL_MODELO = 2;
    public static final int COL_CHASSI = 3;
    public static final int COL_ANO = 4;
    
    public ArrayList<Veiculo> listaVeiculos;
    public VeiculoTableModel(ArrayList<Veiculo> alVeic){
        listaVeiculos = new ArrayList<Veiculo>(alVeic);
    }
    @Override
    public int getRowCount() {
        return listaVeiculos.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override
    public Object getValueAt(int line, int col) {
        Veiculo veiculo = listaVeiculos.get(line);
        
        if(col == COL_CODIGO){return veiculo.getCodigo();}
        if(col == COL_MARCA){return veiculo.getMarca();}
        if(col == COL_MODELO){return veiculo.getModelo();}
        if(col == COL_CHASSI){return veiculo.getChassi();}
        if(col == COL_ANO){return veiculo.getAno();}
        return "";
    }

    @Override
    public String getColumnName(int cols) {
        if(cols == COL_CODIGO){return "Código";}
        if(cols == COL_MARCA){return "Marca";}
        if(cols == COL_MODELO){return "Modelo";}
        if(cols == COL_CHASSI){return "Chassi";}
        if(cols == COL_ANO){return "Ano";}
        return "";
    }
}
