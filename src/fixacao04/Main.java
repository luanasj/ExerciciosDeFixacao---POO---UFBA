package fixacao04;

import java.util.LinkedList;

public class Main {
    public static void showProjetosFinalizados(LinkedList<Projeto> projetos){
        System.out.println("Projetos Finalizados:");
        for(Projeto projeto : projetos){
            if (projeto.isFinalizado()){
                System.out.println("Nome: " + projeto.getNome() + " | " + "Cliente: " + projeto.getNomeCliente());
            }
        }
    }


    public static void main(String[] args){
        LinkedList<Projeto> projetos = new LinkedList<Projeto>();

        Projeto projeto1 = new Projeto("Projeto1","Ameinda",60.57,20);
        Projeto projeto2 = new Projeto("Projeto 2","Babi",80,"Construir design na tela de login");
        Projeto projeto3 = new Projeto("Projeto 3","Josisclaudio",50,50,"Análise de Requisitos Funcionais");

        projetos.add(projeto1);
        projetos.add(projeto2);
        projetos.add(projeto3);

        projeto1.addTarefa("Tarefa Generica","desenvolvedor1",2, Status.FINALIZADA);
        projeto1.addTarefa("Tarefa Generica","desenvolvedor2",5, Status.FINALIZADA);
        projeto1.addTarefa("Tarefa Generica","desenvolvedor1",27, Status.FINALIZADA);

        projeto2.addTarefa("Tarefa Generica","desenvolvedor1",2, Status.FINALIZADA);
        projeto2.addTarefa("Tarefa Generica","desenvolvedor2",5, Status.FINALIZADA);
        projeto2.addTarefa("Tarefa Generica","desenvolvedor1",27, Status.FINALIZADA);

        projeto3.addTarefa("Tarefa Generica","desenvolvedor1",2, Status.FINALIZADA);
        projeto3.addTarefa("Tarefa Generica","desenvolvedor2",5, Status.FINALIZADA);
        projeto3.addTarefa("Tarefa Generica","desenvolvedor1",27, Status.FINALIZADA);

        for(Tarefa tarefa : projeto1.getTarefas()){
            if(tarefa.getStatus() != Status.FINALIZADA){
                tarefa.setStatus(Status.FINALIZADA);
            }
        }

        for(Tarefa tarefa : projeto2.getTarefas()){
            if(tarefa.getStatus() != Status.FINALIZADA){
                tarefa.setStatus(Status.FINALIZADA);
            }
        }

        for(Tarefa tarefa : projeto3.getTarefas()){
            if(tarefa.getStatus() != Status.FINALIZADA){
                tarefa.setStatus(Status.FINALIZADA);
            }
        }

        showProjetosFinalizados(projetos);

    }
}