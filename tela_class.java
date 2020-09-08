package exercicio3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import atividade.TelaProntuario;
import exercicio2.split;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;

public class Exercicio3 extends JFrame {

	private JPanel conteudo;
	TelaProntuario telaProntuario;
	Split divisorDeTela;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio3 frame = new Exercicio3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Exercicio3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 685, 506);
		conteudo = new JPanel();
		conteudo.setBorder(new EmptyBorder(5, 5, 5, 5));
		setconteudo(conteudo);
		conteudo.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(675, 477, -671, -472);
		conteudo.add(desktopPane);	
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 93, 21);
		conteudo.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Adicionar");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("JTabbedPaneDemo");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				telaProntuario = new TelaProntuario();	
				telaProntuario.setVisible(true);				
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);		
		JMenuItem mntmNewMenuItem = new JMenuItem("JSplitDemo");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				telaSplit = new split();				
				telaSplit.setVisible(true);					
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
	}
}