

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JCheckBox;

public class calc extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JTextField textField_9;
    private JTextField textField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    calc frame = new calc();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public calc() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 711, 506);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("Dado");
        lblNewLabel_1.setBounds(26, 38, 46, 14);
        contentPane.add(lblNewLabel_1);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(60, 32, 86, 20);
        contentPane.add(textField_1);

        JLabel lblAtributo = new JLabel("Atributo");
        lblAtributo.setBounds(26, 288, 46, 14);
        contentPane.add(lblAtributo);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(75, 285, 86, 20);
        contentPane.add(textField_2);

        JLabel lblArma = new JLabel("Arma");
        lblArma.setBounds(26, 327, 46, 14);
        contentPane.add(lblArma);

        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(75, 324, 86, 20);
        contentPane.add(textField_3);

        JLabel lblEfeito = new JLabel("Efeito");
        lblEfeito.setBounds(26, 362, 46, 14);
        contentPane.add(lblEfeito);

        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(75, 355, 86, 20);
        contentPane.add(textField_4);

        JButton btnCalcDefesa = new JButton("Calcular");
        btnCalcDefesa.setBounds(333, 419, 101, 23);
        contentPane.add(btnCalcDefesa);

        JLabel lblAtaque = new JLabel("Ataque");
        lblAtaque.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblAtaque.setBounds(60, 240, 75, 37);
        contentPane.add(lblAtaque);

        JLabel lblDefesa = new JLabel("Defesa");
        lblDefesa.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblDefesa.setBounds(379, 240, 75, 37);
        contentPane.add(lblDefesa);

        JLabel lblDestreza = new JLabel("Destreza");
        lblDestreza.setBounds(306, 288, 46, 14);
        contentPane.add(lblDestreza);

        textField_5 = new JTextField();
        textField_5.setColumns(10);
        textField_5.setBounds(379, 285, 86, 20);
        contentPane.add(textField_5);

        textField_6 = new JTextField();
        textField_6.setColumns(10);
        textField_6.setBounds(379, 324, 86, 20);
        contentPane.add(textField_6);

        JLabel lblArmadura = new JLabel("Armadura");
        lblArmadura.setBounds(306, 327, 63, 14);
        contentPane.add(lblArmadura);

        textField_7 = new JTextField();
        textField_7.setColumns(10);
        textField_7.setBounds(379, 359, 86, 20);
        contentPane.add(textField_7);

        JLabel lblModif = new JLabel("Modif");
        lblModif.setBounds(26, 394, 46, 14);
        contentPane.add(lblModif);

        textField_8 = new JTextField();
        textField_8.setColumns(10);
        textField_8.setBounds(75, 387, 86, 20);
        contentPane.add(textField_8);

        JLabel lblModif_1 = new JLabel("Modif(def)");
        lblModif_1.setBounds(306, 362, 63, 14);
        contentPane.add(lblModif_1);

        JLabel lblArma_1 = new JLabel("Arma(def)");
        lblArma_1.setBounds(306, 394, 63, 14);
        contentPane.add(lblArma_1);

        textField_9 = new JTextField();
        textField_9.setColumns(10);
        textField_9.setBounds(379, 390, 86, 20);
        contentPane.add(textField_9);

        JCheckBox chckbxNewCheckBox = new JCheckBox("Golpe Furtivo");
        chckbxNewCheckBox.setBounds(26, 419, 97, 23);
        contentPane.add(chckbxNewCheckBox);
        
        textField = new JTextField();
        textField.setColumns(10);
        textField.setBounds(60, 63, 86, 20);
        contentPane.add(textField);
        
        JLabel lblNewLabel_1_1 = new JLabel("Dano");
        lblNewLabel_1_1.setBounds(26, 63, 46, 14);
        contentPane.add(lblNewLabel_1_1);

        // Adiciona ação para o botão "Calcular"
        btnCalcDefesa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int dadoFaces = Integer.parseInt(textField_1.getText()); // Número de faces do dado
                    int danoFaces = Integer.parseInt(textField.getText());   // Número de faces do dado de dano
                    int atributo = Integer.parseInt(textField_2.getText());
                    int arma = Integer.parseInt(textField_3.getText());
                    int efeito = Integer.parseInt(textField_4.getText());
                    int modif = Integer.parseInt(textField_8.getText()); // Modificador de ataque
                    int destreza = Integer.parseInt(textField_5.getText()); // Destreza
                    int armadura = Integer.parseInt(textField_7.getText());
                    int defesaArma = Integer.parseInt(textField_9.getText()); // Modificador de defesa
                    int modifDef = Integer.parseInt(textField_6.getText());

                    // Rolagem de dado
                    Random dice = new Random();
                    int dado = dice.nextInt(dadoFaces) + 1; // Lançar dado com faces de dadoFaces

                    // Calcula o ataque
                    int ataque = dado + atributo + arma + efeito + modif;

                    // Ajusta o ataque para falha crítica ou acerto crítico
                    String mensagem = "";
                    if (dado == 1) {
                        ataque = 1;
                        mensagem = "Falha Crítica! Ataque = 1.";
                    } 

                    // Calcula a defesa
                    int defesa = (destreza/2) + armadura + defesaArma + modifDef;

                    if (ataque > defesa) {
                        int multiplicador = ataque / defesa; // Quantidade de dados a serem rolados
                        int resultadoDado = 0;
                        StringBuilder dadosResultados = new StringBuilder();

                        for (int i = 0; i < multiplicador; i++) {
                            int roll = dice.nextInt(danoFaces) + 1; // Usar o dado com faces de danoFaces
                            resultadoDado += roll;
                            dadosResultados.append("1d" + danoFaces + " -> Resultado do dado ").append(i + 1).append(": ").append(roll).append("\n");
                        }

                        int danoReal = resultadoDado;
                         if (dado == dadoFaces) {
                            ataque *= 2;
                            danoReal*=2;
                            mensagem = "Acerto Crítico! Ataque dobrado.";
                        }
                        // Verifica se o golpe furtivo está marcado
                        if (chckbxNewCheckBox.isSelected()) {
                            danoReal *= 2; // Multiplica o ataque por 2 se golpe furtivo estiver ativo
                        }
                        JOptionPane.showMessageDialog(null,
                            "Dado Atual: " + dado + 
                            "\n" + mensagem + 
                            "\nAtaque: " + ataque + 
                            "\nDefesa: " + defesa + 
                            "\n" + dadosResultados.toString() + 
                            "\nResultado de ataque total: " + danoReal,
                            "Resultado do Ataque",
                            JOptionPane.INFORMATION_MESSAGE
                        );
                    } else {
                        JOptionPane.showMessageDialog(null, 
                            "Dado Atual: " + dado + 
                            "\n" + mensagem +  
                            "\nDefesa bem sucedida." +
                            "\nAtaque: " + ataque + 
                            "\nDefesa: " + defesa + 
                            "\nNúmero de Faces do Dado: " + dadoFaces,
                            "Resultado da Defesa",
                            JOptionPane.INFORMATION_MESSAGE
                        );
                    }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, 
                        "Por favor, preencha todos os campos obrigatórios com números inteiros.", 
                        "Erro", 
                        JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        });
    }
}
