package fixacao04;

import java.util.LinkedList;

public class Tarefa {

    private String descricao;
    private int horasGastas;
    private String executor;
    private Status status;

    public Tarefa(String descricao, int horasGastas, String executor,Status status){
        this.descricao = descricao;
        this.horasGastas = horasGastas;
        this.executor = executor;
        this.status = status;
    }

    public Tarefa(String descricao){
        this(descricao,0,null,Status.INICIADA);
    }

    public Tarefa(String descricao,String executor){
        this(descricao,0,executor,Status.DELEGADA);
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public int getHorasGastas() {
        return horasGastas;
    }

    public void addHorasGastas(int horasGastas) {
        this.horasGastas += horasGastas;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }









}
