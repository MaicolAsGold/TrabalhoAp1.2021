package br.com.poo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

import br.com.poo.modelo.Data;
import br.com.poo.modelo.Ingresso;
import br.com.poo.modelo.ShowA;
import br.com.poo.modelo.ShowB;
import br.com.poo.modelo.ShowC;
import br.com.poo.modelo.ShowD;
import br.com.poo.modelo.ShowE;

public class AppMain implements ActionListener {

	JRadioButton rba, rbb, rbc, rbd, rbe;
	ButtonGroup bg = new ButtonGroup();
	private boolean compconf = false;

	JFrame jl = new JFrame();
	JFrame jl2 = new JFrame();
	JFrame jl3 = new JFrame();

	JTextArea tasa = new JTextArea();
	JTextArea tasb = new JTextArea();
	JTextArea tasc = new JTextArea();
	JTextArea tasd = new JTextArea();
	JTextArea tase = new JTextArea();
	JTextArea tasf = new JTextArea();
	JTextArea tasg = new JTextArea();
	JTextArea tash = new JTextArea();
	JTextArea tasi = new JTextArea();
	JTextArea tasj = new JTextArea();
	JTextArea titulo = new JTextArea();

	JButton bt = new JButton();
	JButton bt2 = new JButton();
	JButton bt3 = new JButton();
	JButton bt4 = new JButton();
	// Ao mudar quantidade de ingressos modificar também condições dos if do 3ª botão "bt3".
	static Ingresso ia = new Ingresso(500, 700);
	static Ingresso ib = new Ingresso(200, 300);
	static Ingresso ic = new Ingresso(100, 500);
	static Ingresso id = new Ingresso(300, 450);
	static Ingresso ie = new Ingresso(400, 600);

	static Data dta = new Data(10, 05, 2021);
	static Data dtb = new Data(20, 05, 2021);
	static Data dtc = new Data(25, 05, 2021);
	static Data dtd = new Data(10, 06, 2021);
	static Data dte = new Data(20, 06, 2021);

	static ShowA sa = new ShowA(ia, "Killswitch Engage", dta);
	static ShowB sb = new ShowB(ib, "Calcinha Branca", dtb);
	static ShowC sc = new ShowC(ic, "E nomine", dtc);
	static ShowD sd = new ShowD(id, "Era", dtd);
	static ShowE se = new ShowE(ie, "Roberto Carlos", dte);

	public AppMain() {

		rba = new JRadioButton();
		rba.setText("Killswitch Engage");
		rba.setFont(new Font("Algerian", Font.ITALIC, 20));
		rba.setBounds(25, 55, 225, 40);
		rba.setForeground(new Color(200, 200, 200));
		rba.setBackground(new Color(50, 50, 50));

		rbb = new JRadioButton();
		rbb.setText("Calcinha Branca");
		rbb.setFont(new Font("Algerian", Font.ITALIC, 20));
		rbb.setBounds(25, 105, 206, 40);
		rbb.setForeground(new Color(200, 200, 200));
		rbb.setBackground(new Color(50, 50, 50));

		rbc = new JRadioButton();
		rbc.setFont(new Font("Algerian", Font.ITALIC, 20));
		rbc.setText("E nomine");
		rbc.setBounds(25, 155, 111, 40);
		rbc.setForeground(new Color(200, 200, 200));
		rbc.setBackground(new Color(50, 50, 50));

		rbd = new JRadioButton();
		rbd.setText("ERA");
		rbd.setFont(new Font("Algerian", Font.ITALIC, 20));
		rbd.setBounds(25, 205, 65, 40);
		rbd.setForeground(new Color(200, 200, 200));
		rbd.setBackground(new Color(50, 50, 50));

		rbe = new JRadioButton();
		rbe.setText("Roberto Carlos");
		rbe.setFont(new Font("Algerian", Font.ITALIC, 20));
		rbe.setBounds(25, 255, 193, 40);
		rbe.setForeground(new Color(200, 200, 200));
		rbe.setBackground(new Color(50, 50, 50));

		jl.add(rba);
		bg.add(rba);
		jl.add(rbb);
		bg.add(rbb);
		jl.add(rbc);
		bg.add(rbc);
		jl.add(rbd);
		bg.add(rbd);
		jl.add(rbe);
		bg.add(rbe);
		jl.add(titulo);
		jl.add(bt);
		jl2.add(bt2);
		jl2.add(bt3);
		jl3.add(bt4);
		jl2.add(tasa);
		jl2.add(tasb);
		jl2.add(tasc);
		jl2.add(tasd);
		jl2.add(tase);
		jl3.add(tasf);
		jl3.add(tasg);
		jl3.add(tash);
		jl3.add(tasi);
		jl3.add(tasj);

		tasa.setEditable(false);
		tasa.setLineWrap(true);
		tasa.setWrapStyleWord(true);
		tasb.setEditable(false);
		tasb.setLineWrap(true);
		tasb.setWrapStyleWord(true);
		tasc.setEditable(false);
		tasc.setLineWrap(true);
		tasc.setWrapStyleWord(true);
		tasd.setEditable(false);
		tasd.setLineWrap(true);
		tasd.setWrapStyleWord(true);
		tase.setEditable(false);
		tase.setLineWrap(true);
		tase.setWrapStyleWord(true);
		tasf.setEditable(false);
		tasf.setLineWrap(true);
		tasf.setWrapStyleWord(true);
		tasg.setEditable(false);
		tasg.setLineWrap(true);
		tasg.setWrapStyleWord(true);
		tash.setEditable(false);
		tash.setLineWrap(true);
		tash.setWrapStyleWord(true);
		tasi.setEditable(false);
		tasi.setLineWrap(true);
		tasi.setWrapStyleWord(true);
		tasj.setEditable(false);
		tasj.setLineWrap(true);
		tasj.setWrapStyleWord(true);
		titulo.setEditable(false);
		titulo.setLineWrap(true);
		titulo.setWrapStyleWord(true);

		titulo.setBounds(135, 10, 210, 50);
		titulo.setText("Ingressos YMV");
		titulo.setFont(new Font("Algerian", Font.ITALIC, 27));
		titulo.setBackground(new Color(50, 50, 50));
		titulo.setForeground(new Color(200, 200, 200));

		bt.setBounds(397, 325, 80, 30);
		bt.setText("Next");
		bt.addActionListener(this);

		bt2.setBounds(9, 325, 80, 30);
		bt2.setText("Back");
		bt2.addActionListener(this);

		bt3.setBounds(397, 325, 80, 30);
		bt3.setText("Confirm");
		bt3.addActionListener(this);

		bt4.setBounds(9, 325, 120, 30);
		bt4.setText("Return to Menu");
		bt4.addActionListener(this);

		jl.setTitle("Venda de Ingressos");
		jl.setSize(500, 400);
		jl.getContentPane().setLayout(null);
		jl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jl.setLocationRelativeTo(null);
		jl.setResizable(false);
		jl.setVisible(true);
		jl.getContentPane().setBackground(new Color(50, 50, 50));

		jl2.setTitle("Venda de Ingressos");
		jl2.setSize(500, 400);
		jl2.getContentPane().setLayout(null);
		jl2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jl2.setLocationRelativeTo(null);
		jl2.setResizable(false);
		jl2.setVisible(false);
		jl2.getContentPane().setBackground(new Color(50, 50, 50));

		jl3.setTitle("Venda de Ingressos");
		jl3.setSize(500, 400);
		jl3.getContentPane().setLayout(null);
		jl3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jl3.setLocationRelativeTo(null);
		jl3.setResizable(false);
		jl3.setVisible(false);
		jl3.getContentPane().setBackground(new Color(50, 50, 50));

	}

	public static void main(String[] args) {

		new JButton();
		new AppMain();
		new JTextArea();
		new JRadioButton();

		JOptionPane.showMessageDialog(null, "Capacidade total do show é proporcional a quantidade total de ingressos");

	}

	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == bt) {
			if (rba.isSelected()) {
				tasa.setText(sa.impressao());
				tasa.setFont(new Font("Algerian", Font.ITALIC, 27));
				tasa.setBounds(0, 0, 500, 400);
				tasa.setBackground(new Color(50, 50, 50));
				tasa.setForeground(new Color(200, 200, 200));
				tasb.hide();
				tasc.hide();
				tasd.hide();
				tase.hide();

			} else if (rbb.isSelected()) {
				tasb.setText(sb.impressao());
				tasb.setFont(new Font("Algerian", Font.ITALIC, 30));
				tasb.setBounds(0, 0, 500, 400);
				tasb.setBackground(new Color(50, 50, 50));
				tasb.setForeground(new Color(200, 200, 200));
				tasa.hide();
				tasc.hide();
				tasd.hide();
				tase.hide();

			} else if (rbc.isSelected()) {
				tasc.setText(sc.impressao());
				tasc.setFont(new Font("Algerian", Font.ITALIC, 30));
				tasc.setBounds(0, 0, 500, 400);
				tasc.setBackground(new Color(50, 50, 50));
				tasc.setForeground(new Color(200, 200, 200));
				tasa.hide();
				tasb.hide();
				tasd.hide();
				tase.hide();

			} else if (rbd.isSelected()) {
				tasd.setText(sd.impressao());
				tasd.setFont(new Font("Algerian", Font.ITALIC, 30));
				tasd.setBounds(0, 0, 500, 400);
				tasd.setBackground(new Color(50, 50, 50));
				tasd.setForeground(new Color(200, 200, 200));
				tasa.hide();
				tasb.hide();
				tasc.hide();
				tase.hide();

			} else if (rbe.isSelected()) {
				tase.setText(se.impressao());
				tase.setFont(new Font("Algerian", Font.ITALIC, 27));
				tase.setBounds(0, 0, 500, 400);
				tase.setBackground(new Color(50, 50, 50));
				tase.setForeground(new Color(200, 200, 200));
				tasa.hide();
				tasb.hide();
				tasc.hide();
				tasd.hide();

			} else {
				JOptionPane.showMessageDialog(null, "Selecione o show", "Aviso", JOptionPane.ERROR_MESSAGE);
			}

			if (rba.isSelected() == true || rbb.isSelected() == true || rbc.isSelected() == true
					|| rbd.isSelected() == true || rbe.isSelected() == true) {
				jl.setVisible(false);
				jl2.setVisible(true);

			}
		}
		if (e.getSource() == bt2) {
			jl2.setVisible(false);
			jl.setVisible(true);
			tasa.show();
			tasb.show();
			tasc.show();
			tasd.show();
			tase.show();

		}
		if (e.getSource() == bt3) {
			jl2.dispose();
			jl.setVisible(false);
			jl3.setVisible(true);

			int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de ingressos desejado: "));

			if (rba.isSelected()) {
				ia.qnting(x);
				if (ia.getQnt() < ia.x || ia.x == 0) {
					JOptionPane.showMessageDialog(null, "Valor informado inválido");

				} else if (x < 0) {
					JOptionPane.showMessageDialog(null, "Desculpe, mas não compramos ingresso", "Aviso",
							JOptionPane.ERROR_MESSAGE);
				} else {
					ia.comprar(ia.x);
					ia.preco();
					JOptionPane.showMessageDialog(null, "Compra confirmada");
					compconf = true;
				}
			} else if (rbb.isSelected()) {
				ib.qnting(x);
				if (ib.getQnt() < ib.x || ib.x == 0) {
					JOptionPane.showMessageDialog(null, "Valor informado inválido");

				} else if (x < 0) {
					JOptionPane.showMessageDialog(null, "Desculpe, mas não compramos ingresso", "Aviso",
							JOptionPane.ERROR_MESSAGE);
				} else {
					ib.comprar(ib.x);
					ib.preco();
					JOptionPane.showMessageDialog(null, "Compra confirmada");
					compconf = true;
				}
			} else if (rbc.isSelected()) {
				ic.qnting(x);
				if (ic.x > ic.getQnt() || ic.x == 0) {
					JOptionPane.showMessageDialog(null, "Valor informado inválido");

				} else if (x < 0) {
					JOptionPane.showMessageDialog(null, "Desculpe, mas não compramos ingresso", "Aviso",
							JOptionPane.ERROR_MESSAGE);
				} else {
					ic.comprar(ic.x);
					ic.preco();
					JOptionPane.showMessageDialog(null, "Compra confirmada");
					compconf = true;

				}
			} else if (rbd.isSelected()) {
				id.qnting(x);
				if (id.x > id.getQnt() || id.x == 0) {
					JOptionPane.showMessageDialog(null, "Valor informado inválido");
				} else if (x < 0) {
					JOptionPane.showMessageDialog(null, "Desculpe, mas não compramos ingresso", "Aviso",
							JOptionPane.ERROR_MESSAGE);
				} else {
					id.comprar(id.x);
					id.preco();
					JOptionPane.showMessageDialog(null, "Compra confirmada");
					compconf = true;
				}
			} else if (rbe.isSelected()) {
				ie.qnting(x);
				if (ie.x > ie.getQnt() || ie.x == 0) {
					JOptionPane.showMessageDialog(null, "Valor informado inválido");
				} else if (x < 0) {
					JOptionPane.showMessageDialog(null, "Desculpe, mas não compramos ingresso", "Aviso",
							JOptionPane.ERROR_MESSAGE);
				} else {
					ie.comprar(ie.x);
					ie.preco();
					JOptionPane.showMessageDialog(null, "Compra confirmada");
					compconf = true;
				}
			}
			if (rba.isSelected()) {
				if (x <= 500 && x != 0 && x > 0 && compconf == true) {
					tasf.setText(sa.dadosDaCompra());
					tasf.setFont(new Font("Algerian", Font.ITALIC, 17));
					tasf.setBounds(0, 0, 500, 320);
					tasf.setBackground(new Color(50, 50, 50));
					tasf.setForeground(new Color(200, 200, 200));
					tasf.show();
					compconf = false;

				}
			}
			if (rbb.isSelected()) {
				if (x <= 200 && x != 0 && x > 0 && compconf == true) {
					tasg.setText(sb.dadosDaCompra());
					tasg.setFont(new Font("Algerian", Font.ITALIC, 18));
					tasg.setBounds(0, 0, 500, 320);
					tasg.setBackground(new Color(50, 50, 50));
					tasg.setForeground(new Color(200, 200, 200));
					tasg.show();
					compconf = false;
				}
			}
			if (rbc.isSelected()) {
				if (x <= 100 && x != 0 && x > 0 && compconf == true) {
					tash.setText(sc.dadosDaCompra());
					tash.setFont(new Font("Algerian", Font.ITALIC, 18));
					tash.setBounds(0, 0, 500, 320);
					tash.setBackground(new Color(50, 50, 50));
					tash.setForeground(new Color(200, 200, 200));
					tash.show();
					compconf = false;
				}
			}
			if (rbd.isSelected()) {
				if (x <= 300 && x != 0 && x > 0 && compconf == true) {
					tasi.setText(sd.dadosDaCompra());
					tasi.setFont(new Font("Algerian", Font.ITALIC, 17));
					tasi.setBounds(0, 0, 500, 320);
					tasi.setBackground(new Color(50, 50, 50));
					tasi.setForeground(new Color(200, 200, 200));
					tasi.show();
					compconf = false;
				}
			}
			if (rbe.isSelected()) {
				if (x <= 400 && x != 0 && x > 0 && compconf == true) {
					tasj.setText(se.dadosDaCompra());
					tasj.setFont(new Font("Algerian", Font.ITALIC, 18));
					tasj.setBounds(0, 0, 500, 320);
					tasj.setBackground(new Color(50, 50, 50));
					tasj.setForeground(new Color(200, 200, 200));
					tasj.show();
					compconf = false;
				}
			}
		}
		if (e.getSource() == bt4) {
			jl.setVisible(true);
			jl2.setVisible(false);
			jl3.setVisible(false);
			tasa.show();
			tasb.show();
			tasc.show();
			tasd.show();
			tase.show();
			tasf.hide();
			tasg.hide();
			tash.hide();
			tasi.hide();
			tasj.hide();
		}
	}

}
