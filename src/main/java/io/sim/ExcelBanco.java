package io.sim;

public class ExcelBanco extends Thread{
    // thread que atualiza a planilha com os dados das transações
    Banco banco;
    public ExcelBanco(Banco banco){
        this.banco = banco;
    }

    @Override
    public void run(){
        try{

        while(Banco.ativo){
            if(!Banco.transacoes.isEmpty()){
                Relatorio.manipulaExcelTransacao(Banco.transacoes.remove(0));
            }
            Thread.sleep(100);
        }

    } catch(Exception e){
        
    }
    }
}
