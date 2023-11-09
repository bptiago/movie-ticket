import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
public class ModelSessoes extends AbstractTableModel {

    ArrayList<Sessao> sessao = new ArrayList();

    String[] colunas = {"Filme", "Sala", "Horario", "Dublado", "Preco"};

    public void addSessao(Sessao s) {
        sessao.add(s);
        this.fireTableDataChanged(); // Atualizar a tabela
    }

    public Sessao returnSessao(int index){
        return sessao.get(index);
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
        } else if(columnIndex == 2){
            return sessao.get(rowIndex).getHorario();
        } else if(columnIndex == 3) {
            if(sessao.get(rowIndex).getIsDublado()) {
                return "Sim";
            } else {
                return "Não";
            }
        } else {
            return sessao.get(rowIndex).getPreco();
        }
    }
}
