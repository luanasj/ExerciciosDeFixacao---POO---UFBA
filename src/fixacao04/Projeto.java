package fixacao04;

import java.util.LinkedList;

public class Projeto {
    private String nome;
    private String nomeCliente;
    private LinkedList<Tarefa> tarefas;
    private int qtdTarefa;
    private int qtdMaxTarefa;
    private double horaDeTrabalho;
    private boolean finalizado = false;

    public Projeto(String nome, String nomeCliente, double horaDeTrabalho,int qtdMaxTarefa){
        this.nome = nome;
        this.nomeCliente = nomeCliente;
        this.tarefas = new LinkedList<Tarefa>();
        this.qtdTarefa = 0;
        this.qtdMaxTarefa = qtdMaxTarefa;
        this.horaDeTrabalho = horaDeTrabalho;
    }

    public Projeto(String nome, String nomeCliente, double horaDeTrabalho, String descTarefa){
        this(nome,nomeCliente,horaDeTrabalho,0);
        this.tarefas = new LinkedList<Tarefa>();
        this.tarefas.add(new Tarefa(descTarefa));
        this.qtdTarefa = 1;
    }

    public Projeto(String nome, String nomeCliente, double horaDeTrabalho,int qtdMaxTarefa, String descTarefa){
        this(nome,nomeCliente,horaDeTrabalho,descTarefa);
        this.qtdMaxTarefa = qtdMaxTarefa;
    }


    public int getQtdTarefa() {
        return qtdTarefa;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public LinkedList<Tarefa> getTarefas() {
        return tarefas;
    }

    public int getQtdMaxTarefa() {
        return qtdMaxTarefa;
    }

    public double getHoraDeTrabalho() {
        return horaDeTrabalho;
    }


    public void setHoraDeTrabalho(double horaDeTrabalho) {
        this.horaDeTrabalho = horaDeTrabalho;
    }

    public void setQtdMaxTarefa(int qtdMaxTarefa) {
        this.qtdMaxTarefa = qtdMaxTarefa;
    }

    public void addTarefas(String descricao) {
        this.tarefas.add(new Tarefa(descricao));
        qtdTarefa = tarefas.size();
    }

    public void addTarefas(String descricao,String executor,int tempoGasto, boolean finalizada) {
        this.tarefas.add(new Tarefa(descricao,executor,tempoGasto,finalizada));
        qtdTarefa = tarefas.size();
    }




}
