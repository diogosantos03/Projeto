package br.com.ufpb.projetoDisciplinaPOO;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GUI extends JFrame implements ActionListener{
	private GerenteDeProfessor gerente;
	private JButton botao1, botao2, botao3, botao4;
	
	public GUI(){
		super("Sistema");
		
		this.gerente=new GerenteDeProfessor(); 
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		Container c2 = new JPanel();
		c2.setLayout(new GridLayout(4,1));
		
		botao1=new JButton("Cadastrar Aluno");
		c2.add(botao1);
		
		botao2=new JButton("Cadastrar Professor");
		c2.add(botao2);
		
		botao3=new JButton("Pesquisar Aluno");
		c2.add(botao3);
		
		botao4=new JButton("Pesquisar professor");
		c2.add(botao4);
		
		c.setLayout(new BorderLayout(5,5));
		c.add(BorderLayout.CENTER, new JButton("Exercícios"));
		c.add(BorderLayout.EAST, c2);
		
		this.setVisible(true);
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocation(150, 150);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent evento) {
		String nome = JOptionPane.showInputDialog("Digite o nome: ");
		String matricula=JOptionPane.showInputDialog("Digite a matricula: ");
		try{
		 gerente.cadastrarProfessor(nome, matricula);
		}catch(ProfessorJaExisteException e){
			
		}
		
		
	}

}
