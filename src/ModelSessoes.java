/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author danil
 */
public class ModelSessoes extends AbstractTableModel {
    
    ArrayList<Sessoes> sessao = new ArrayList();
    
    String[] colunas = {"Filme", "Sala", "Horario"};
    
    public ModelSessoes(Sessoes s){
        sessao.add(s);
        this.fireTableDataChanged();
    }
  
    @Override
    public int getRowCount() {
        return sessao.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    @Override
    public String getColumnName(int Column) {
        return colunas[Column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex == 0){
            return sessao.get(rowIndex).getNomeFilme();
        } else if(columnIndex == 1){
            return sessao.get(rowIndex).getSala();
        } else{
            return sessao.get(rowIndex).getHorario();
        }
}
}
