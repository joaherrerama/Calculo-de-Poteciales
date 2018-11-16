/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package satelital;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
import java.util.Date;

public class Satelital extends JFrame {
    
            
    private JPanel contentPane;
        private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;

        
        /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
                    
                        
			public void run() {
				try {
					Satelital frame = new Satelital();
					frame.setVisible(true);
				} catch (Exception e) {
				}
			}
		});
	}
private Object DefaultComponentFactory;
public Satelital () {
    
    

     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 989, 739);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
               	contentPane.setBorder(new EmptyBorder(4, 2, 3, 3));
		setContentPane(contentPane);
		contentPane.setLayout(null);
       
      this.setResizable(false);
                
     setIconImage(new ImageIcon( getClass().getResource("/imagenes/icono.jpg")).getImage());
                ((JPanel)getContentPane()).setOpaque(false); 
                ImageIcon uno=new ImageIcon(this.getClass().getResource("/imagenes/fondo.jpg"));
                JLabel fondo= new JLabel(); fondo.setIcon(uno); 
                getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
                fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());

     setTitle("GEODESIA SATELITAL- TRANSFORMACION DE COORDENADAS-2016.II");
                
     // DECLARACION DE LOS DATOS DE ENTRADA-----------------------------------------------------------------------------------------------------
               
                JLabel lblIngresarDatos = new JLabel("VALORES DE ENTRADA:");
		lblIngresarDatos.setForeground(Color.CYAN );
		lblIngresarDatos.setFont(new Font("Kai", Font.BOLD, 15));
		lblIngresarDatos.setBounds(159, 190, 220, 18);
		contentPane.add(lblIngresarDatos);
                
                JLabel lblIngreseLaLatitud = new JLabel("LATITUD");
                lblIngreseLaLatitud.setForeground(Color.white );
                lblIngreseLaLatitud.setBounds(20, 264, 129, 18);
		contentPane.add(lblIngreseLaLatitud);
                
                JLabel lblIngreseGrados = new JLabel("Grados  Minutos  Segundos");
                lblIngreseGrados.setForeground(Color.white );
                lblIngreseGrados.setFont(new Font("Kai", Font.BOLD, 12));
                lblIngreseGrados.setBounds(100, 244, 200, 20);
		contentPane.add(lblIngreseGrados);
                
                contentPane.add(lblIngreseGrados);
                textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(100, 264, 46, 20);
		contentPane.add(textField_1);

                 
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(150, 264, 46, 20);
		contentPane.add(textField_2);
		
                
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(200, 264, 60, 20);
		contentPane.add(textField_3);
                
                JLabel lblIngreseLaLongitud = new JLabel("LONGITUD");
                lblIngreseLaLongitud.setForeground(Color.white);
		lblIngreseLaLongitud.setBounds(20,293 , 129, 14);
		contentPane.add(lblIngreseLaLongitud);
                
                textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(100, 293, 46, 20);
		contentPane.add(textField_4);

                textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(150, 293, 46, 20);
		contentPane.add(textField_5);
		
                
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(200, 293, 60, 20);
		contentPane.add(textField_6);
                
                JLabel lblIngreseLaAltura = new JLabel("ALTURA");
                lblIngreseLaAltura.setForeground(Color.white );
		lblIngreseLaAltura.setBounds(20,322 , 129, 14);
		contentPane.add(lblIngreseLaAltura);
                
                JLabel lblIngreseMetros = new JLabel("Metros");
                lblIngreseMetros.setForeground(Color.white );
                lblIngreseMetros.setFont(new Font("Kai", Font.BOLD, 12));
                lblIngreseMetros.setBounds(180, 322, 77, 20);
                
                contentPane.add(lblIngreseMetros);
                textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(100, 322, 77, 20);
		contentPane.add(textField_7);
                

                JLabel lblIngreseLaFO = new JLabel("Fecha de Observacion");
                lblIngreseLaFO.setForeground(Color.white );
		lblIngreseLaFO.setBounds(20,382 , 129, 14);
		contentPane.add(lblIngreseLaFO);
                
               
                final JDateChooser dateChooser = new JDateChooser();
                dateChooser.setBounds(150,382,200, 20); // Modify depending on your preference
                contentPane.add(dateChooser);
                
                
		JLabel lblIngreseLaFR = new JLabel("Fecha Requerida");
                 lblIngreseLaFR.setForeground(Color.white );
		lblIngreseLaFR.setBounds(20, 405, 129, 14);
		contentPane.add(lblIngreseLaFR);
                
                final JDateChooser dateChooser_1 = new JDateChooser();
                dateChooser_1.setBounds(150,405,200, 20); // Modify depending on your preference
                contentPane.add(dateChooser_1);        
                
                
                JLabel lblIngresarDatosDel = new JLabel("Modelo de Velicidades (MagnaSirgasPro)");
		lblIngresarDatosDel.setFont(new Font("kai", Font.BOLD, 14));
                lblIngresarDatosDel.setForeground(Color.white );
		lblIngresarDatosDel.setBounds(20, 450, 361, 14);
		contentPane.add(lblIngresarDatosDel);
                
                
                               
                JLabel lblIngreseVx = new JLabel("Vx");
                lblIngreseVx.setForeground(Color.WHITE );
		lblIngreseVx.setBounds(20,480, 152, 18);
		contentPane.add(lblIngreseVx);
                
                JLabel lblIngresev = new JLabel("Metros/Año");
                lblIngresev.setForeground(Color.white );
                lblIngresev.setFont(new Font("Kai", Font.BOLD, 12));
                lblIngresev.setBounds(160, 480, 100, 20);
		contentPane.add(lblIngresev);
                
                textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(50, 480, 100, 20);
		contentPane.add(textField_14);
                
                JLabel lblIngreseVy = new JLabel("Vy");
                lblIngreseVy.setForeground(Color.WHITE );
		lblIngreseVy.setBounds(20,510, 152, 18);
		contentPane.add(lblIngreseVy);
                
                JLabel lblIngresev1 = new JLabel("Metros/Año");
                lblIngresev1.setForeground(Color.white );
                lblIngresev1.setFont(new Font("Kai", Font.BOLD, 12));
                lblIngresev1.setBounds(160, 510, 100, 20);
		contentPane.add(lblIngresev1);
                
                textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(50, 510, 100, 20);
		contentPane.add(textField_15);
                
                JLabel lblIngreseVz = new JLabel("Vz");
                lblIngreseVz.setForeground(Color.WHITE );
		lblIngreseVz.setBounds(20,540, 152, 18);
		contentPane.add(lblIngreseVz);

                JLabel lblIngresev2 = new JLabel("Metros/Año");
                lblIngresev2.setForeground(Color.white );
                lblIngresev2.setFont(new Font("Kai", Font.BOLD, 12));
                lblIngresev2.setBounds(160, 540, 100, 20);
		contentPane.add(lblIngresev2);
                
                textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(50, 540, 100, 20);
		contentPane.add(textField_16);
                
                
                final JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setForeground(Color.BLACK);
                btnCalcular.setBackground(Color.white);
		btnCalcular.setFont(new Font("kai", Font.PLAIN, 14));
		btnCalcular.setBounds(400,600, 208, 60);
                
 
                
                JButton limpiar = new JButton("Limpiar");
		limpiar.setForeground(Color.BLACK);
                limpiar.setBackground(Color.white);
		limpiar.setFont(new Font("kai", Font.PLAIN, 14));
		limpiar.setBounds(20,600, 208, 60);
                
                
         limpiar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        
         textField_1.setText(" "); 
	 textField_2.setText(" ");
	 textField_3.setText(" ");
	 textField_4.setText(" ");
	 textField_5.setText(" ");
	 textField_6.setText(" ");
	 textField_7.setText(" ");
	 textField_8.setText(" ");
	 textField_9.setText(" ");
	 textField_10.setText(" ");
	 textField_11.setText(" ");
	 textField_12.setText(" ");
	 textField_13.setText(" ");
	 textField_14.setText(" ");
	 textField_15.setText(" ");
	 textField_16.setText(" ");
	 textField_17.setText(" ");
	 textField_18.setText(" ");
	 textField_19.setText(" ");
	 textField_20.setText(" ");
	 textField_21.setText(" ");
	 textField_22.setText(" ");
	 textField_23.setText(" ");
	 textField_24.setText(" ");
	 textField_25.setText(" ");
	 textField_26.setText(" ");
	 textField_27.setText(" ");
	 textField_28.setText(" ");
	 textField_29.setText(" ");
	 textField_30.setText(" ");
	 textField_31.setText(" ");
	 textField_32.setText(" ");
	 textField_33.setText(" ");
                    }
                private JTextField setText(Object object) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
                });
         contentPane.add(limpiar);
         
              btnCalcular.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String g1 =textField_1.getText();
                        String m1 =textField_2.getText();
                        String s1 =textField_3.getText(); 
                        String g2 =textField_4.getText(); 
                        String m2 =textField_5.getText(); 
                        String s2 =textField_6.getText(); 
                        String alt =textField_7.getText(); 
                        String d1 =  Integer.toString(dateChooser.getCalendar().get(Calendar.DAY_OF_MONTH));
                        String me1 = Integer.toString(dateChooser.getCalendar().get(Calendar.MONTH) + 1);
                        String an1 = Integer.toString(dateChooser.getCalendar().get(Calendar.YEAR));
                        String d2 =  Integer.toString(dateChooser_1.getCalendar().get(Calendar.DAY_OF_MONTH));
                        String me2 = Integer.toString(dateChooser_1.getCalendar().get(Calendar.MONTH) + 1);
                        String an2 = Integer.toString(dateChooser_1.getCalendar().get(Calendar.YEAR));
                        String vx =textField_14.getText();
                        String vy =textField_15.getText();
                        String vz =textField_16.getText();

                        
                        float PI = (float) Math.PI;
			double fg1 = Double.parseDouble(g1); 
                        double fm1 = Double.parseDouble(m1); 
                        double fs1 = Double.parseDouble(s1);
                        double fg2 = Double.parseDouble(g2); 
                        double fm2 = Double.parseDouble(m2);
                        double fs2 = Double.parseDouble(s2);
                        double falt = Double.parseDouble(alt);  
                        double fd1 = Double.parseDouble(d1); 
                        double fme1 = Double.parseDouble(me1);  
                        double fan1 = Double.parseDouble(an1); 
                        double fd2 = Double.parseDouble(d2); 
                        double fme2 = Double.parseDouble(me2);
                        double fan2=Double.parseDouble(an2); 
                        double fvx=Double.parseDouble(vx);
                        double fvy=Double.parseDouble(vy);
                        double fvz=Double.parseDouble(vz);

			double L1 = ((fg1 + (fm1/60) + (fs1/3600))*Math.PI)/180;
			double L2 = ((fg2 + (fm2/60) + (fs2/3600))*Math.PI)/180;
			double f1 = fan1 + ((fme1-1)/12) + (fd1/360);
			double f2 = fan2 + ((fme2-1)/12) + (fd2/360);
                        double dif = f2-f1;
			double r1 = 6298137;
			double r2 = 6378137;
			double k = 6.67*(Math.pow(10, -11));
			double p = 2670;
                                if( (Math.abs(L1))>((Math.PI)/2) || (Math.abs(L2))>((Math.PI)))
				{
					JOptionPane.showMessageDialog(null,"Error: Las latitudes deben ser menores o iguales a 90° y mayores o iguales a -90° y las longitudes deben ser menores o iguales a 180° y mayores o iguales a -180°.","ERROR",JOptionPane.ERROR_MESSAGE);
				}
                                else{
					if( fm1>60 || fm1<0 || fs1>60 || fs1<0 || fm2>60 || fm2<0 || fs2>60 || fs2<0)
					{
						JOptionPane.showMessageDialog(null,"Error: Los minutos y segundos deben de ser menores o iguales a 60 y mayores o iguales a cero.","ERROR",JOptionPane.ERROR_MESSAGE);
					}
					else{
                                            
                                            if( falt < 0)
					{
						JOptionPane.showMessageDialog(null,"Error: Las Alturas son positivas SOCIO ","ERROR",JOptionPane.ERROR_MESSAGE);
                                        }                                                                                           
                                            else{
                                                
				//Calculo de N
				double N = (r2)/(Math.sqrt(1-((6.69438007 * Math.pow(10,-3))*Math.pow(Math.sin(L1),2))));
                                
                                //Calculo de Coordenadas Geocentricas
                                
                                double cx1 = (N + falt);
                                double cx2 = (Math.cos(L1));
                                double cx3 = (Math.cos(L2));
                                double cx = cx1 * cx2 * cx3;
                                
                                double cy1 = (N + falt);
                                double cy2 = (Math.cos(L1));
                                double cy3 = (Math.sin(L2));
                                double cy = cy1 * cy2 * cy3;
				
                                double cz1 = 1-(6.69438007* Math.pow(10,-3));
                                double cz2 =  Math.sin(L1);
                                double cz = ((N * cz1) + falt) * cz2;
                                
                           	textField_17.setText(Double.toString(dif));
				textField_18.setText(Double.toString(N));
				textField_19.setText(Double.toString(cx));
				textField_20.setText(Double.toString(cy));
                                textField_21.setText(Double.toString(cz));
                                
                                double vdtx = fvx * dif;
                                double vdty = fvy * dif;
                                double vdtz = fvz * dif;
                                
                                textField_22.setText(Double.toString(vdtx));
				textField_23.setText(Double.toString(vdty));
				textField_24.setText(Double.toString(vdtz));

                                // Calculo Final de Coordenadas
                                
                                double x = cx + vdtx;
                                double y = cy + vdty;
                                double z = cz + vdtz;
                                
                                textField_25.setText(Double.toString(x));
				textField_26.setText(Double.toString(y));
				textField_27.setText(Double.toString(z));
                                
                                            }
                                }
                                
                }

      }
              });
              contentPane.add(btnCalcular);
              
                JLabel lblA = new JLabel("N");
		lblA.setBounds(450, 267, 46, 14);
                lblA.setForeground(Color.WHITE );
		contentPane.add(lblA);
                
                textField_18 = new JTextField();
		textField_18.setBounds(470,267,100, 20);
		contentPane.add(textField_18);
		textField_18.setColumns(10);
                
                JLabel lbldif = new JLabel("Diferencias en Años");
		lbldif.setBounds(450, 298, 216, 14);
                lbldif.setForeground(Color.WHITE );
		contentPane.add(lbldif);
                
                JLabel lblf = new JLabel("Años");
		lblf.setBounds(690, 298, 216, 14);
                lblf.setForeground(Color.RED );
		contentPane.add(lblf);               
                
                textField_17 = new JTextField();
		textField_17.setBounds(580,298,100, 20);
		contentPane.add(textField_17);
		textField_17.setColumns(10);
                
                JLabel lblAEs_1 = new JLabel("COORDENADAS GEOCENTRICAS");
		lblAEs_1.setBounds(450, 330, 216, 14);
                lblAEs_1.setForeground(Color.WHITE );
		contentPane.add(lblAEs_1);
                
                JLabel lblAEs_2 = new JLabel("X");
		lblAEs_2.setBounds(450, 364, 46, 14);
		lblAEs_2.setForeground(Color.WHITE );
                contentPane.add(lblAEs_2);
                
                JLabel lblm1 = new JLabel("Metros");
		lblm1.setBounds(580, 364, 46, 14);
		lblm1.setForeground(Color.RED );
                contentPane.add(lblm1);
		
                textField_19 = new JTextField();
		textField_19.setBounds(470, 364,100, 20);
		contentPane.add(textField_19);
		textField_19.setColumns(10);
		
                JLabel lblAEs_3 = new JLabel("Y");
		lblAEs_3.setBounds(450, 397, 46, 14);
                lblAEs_3.setForeground(Color.WHITE );
		contentPane.add(lblAEs_3);
		
                JLabel lblm2 = new JLabel("Metros");
		lblm2.setBounds(580, 397, 46, 14);
		lblm2.setForeground(Color.RED );
                contentPane.add(lblm2);
                
                textField_20 = new JTextField();
		textField_20.setBounds(470, 397, 100, 20);
		contentPane.add(textField_20);
		textField_20.setColumns(10);
		
                JLabel lblAEs_4 = new JLabel("Z");
		lblAEs_4.setBounds(450, 427, 46, 14);
		lblAEs_4.setForeground(Color.WHITE );
                contentPane.add(lblAEs_4);
		
                JLabel lblm3 = new JLabel("Metros");
		lblm3.setBounds(580, 427, 46, 14);
		lblm3.setForeground(Color.RED );
                contentPane.add(lblm3);
                
                textField_21 = new JTextField();
		textField_21.setBounds(470, 427, 100, 20);
		contentPane.add(textField_21);
		textField_21.setColumns(10);
                
                JLabel lblAEs_7 = new JLabel("MODELO DE VELOCIDAD * DELTA TIEMPO");
		lblAEs_7.setBounds(700, 330, 216, 14);
                lblAEs_7.setForeground(Color.WHITE );
		contentPane.add(lblAEs_7);
                
                 JLabel lblAEs_8 = new JLabel("Vdtx");
		lblAEs_8.setBounds(700, 364, 46, 14);
		lblAEs_8.setForeground(Color.WHITE );
                contentPane.add(lblAEs_8);
                
	
                textField_22 = new JTextField();
		textField_22.setBounds(730, 364,100, 20);
		contentPane.add(textField_22);
		textField_2.setColumns(10);
		
                JLabel lblAEs_10 = new JLabel("Vdty");
		lblAEs_10.setBounds(700, 397, 46, 14);
                lblAEs_10.setForeground(Color.WHITE );
		contentPane.add(lblAEs_10);
		
                               
                textField_23 = new JTextField();
		textField_23.setBounds(730, 397, 100, 20);
		contentPane.add(textField_23);
		textField_23.setColumns(10);
		
                JLabel lblAEs_9 = new JLabel("Vdtz");
		lblAEs_9.setBounds(700, 427, 46, 14);
		lblAEs_9.setForeground(Color.WHITE );
                contentPane.add(lblAEs_9);
		             
                textField_24 = new JTextField();
		textField_24.setBounds(730, 427, 100, 20);
		contentPane.add(textField_24);
		textField_24.setColumns(10);
                
		JLabel lblBEs = new JLabel("COORDENADAS TRANSFORMADAS");
		lblBEs.setBounds(450, 461, 216, 14);
		lblBEs.setForeground(Color.WHITE );
                contentPane.add(lblBEs);
		
		JLabel lblBEs_1 = new JLabel("X");
		lblBEs_1.setBounds(450, 489, 46, 14);
                lblBEs_1.setForeground(Color.RED );
		contentPane.add(lblBEs_1);
                
                JLabel lblm4 = new JLabel("Metros");
		lblm4.setBounds(580, 489, 46, 14);
		lblm4.setForeground(Color.RED );
                contentPane.add(lblm4);
        	
                textField_25 = new JTextField();
		textField_25.setBounds(470,489, 100, 20);
		contentPane.add(textField_25);
		textField_25.setColumns(10);
                
		JLabel lblBEs_2 = new JLabel("Y");
		lblBEs_2.setBounds(450, 525, 46, 14);
                lblBEs_2.setForeground(Color.RED );
		contentPane.add(lblBEs_2);
                
                JLabel lblm5 = new JLabel("Metros");
		lblm5.setBounds(580, 525, 46, 14);
		lblm5.setForeground(Color.RED );
                contentPane.add(lblm5);
                
              
                textField_26 = new JTextField();
		textField_26.setBounds(470, 525, 100, 20);
		contentPane.add(textField_26);
		textField_26.setColumns(10);
                
                JLabel lblBEs_3 = new JLabel("Z");
		lblBEs_3.setBounds(450, 561, 100, 14);
                lblBEs_3.setForeground(Color.RED );
		contentPane.add(lblBEs_3);
                
                JLabel lblm6 = new JLabel("Metros");
		lblm6.setBounds(580, 561, 46, 14);
		lblm6.setForeground(Color.RED );
                contentPane.add(lblm6);
                                
                textField_27 = new JTextField();
		textField_27.setBounds(470, 561, 100, 20);
		contentPane.add(textField_27);
		textField_27.setColumns(10);
                
 /////////////////////////////////////////////////////////////////PRESENTACIÓN DEL TRABAJO ///////////////////////////////////////////////////////////////////////////////////////////               
                JLabel lblhel = new JLabel("Jorge Andrés Herrera                      cod: 20112025109 ");
		lblhel.setBounds(320, 70, 400, 14);
                lblhel.setForeground(Color.WHITE );
		contentPane.add(lblhel);
                
                JLabel lbljei = new JLabel("Edward Alonso Garcia                      cod:20112025117 ");
		lbljei.setBounds(320, 90, 400, 14);
                lbljei.setForeground(Color.WHITE );
		contentPane.add(lbljei);
                JLabel lblcue = new JLabel(" Mishell Salinas                                  cod: 20131025071");
		lblcue.setBounds(320, 110, 400, 14);
                lblcue.setForeground(Color.WHITE );
		contentPane.add(lblcue);
                
                JLabel jhlcue = new JLabel(" Daniel Saavedra                                cod: 20131025020");
		jhlcue.setBounds(320, 130, 400, 14);
                jhlcue.setForeground(Color.WHITE );
		contentPane.add(jhlcue);
                
                JLabel k = new JLabel("K= 6.67 E-11 Nm^2/kg^2 ");
		k.setBounds(20, 90, 400, 14);
                k.setForeground(Color.WHITE );
		contentPane.add(k);
                JLabel p = new JLabel(" p= 2670 kg/m^3 ");
		p.setBounds(20, 110, 400, 14);
                p.setForeground(Color.WHITE );
		contentPane.add(p);
                
                
                JLabel m = new JLabel(" M= 5.97 E24 kg");
		m.setBounds(20, 130, 400, 14);
                m.setForeground(Color.WHITE );
		contentPane.add(m);
                
                JLabel a = new JLabel(" a= 6378137 metros ");
		a.setBounds(20, 150, 400, 14);
                a.setForeground(Color.WHITE );
		contentPane.add(a);
                
                
                JLabel lblIntegrantes = new JLabel("PROGRAMA GEODESIA SATELITAL");
		lblIntegrantes.setFont(new Font("kira", Font.PLAIN, 20));
                 lblIntegrantes.setForeground(Color.WHITE );
		lblIntegrantes.setBounds(350, 15, 1000, 30);
		contentPane.add(lblIntegrantes);
                JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(41, 453, 1, 2);
		contentPane.add(separator_2);
              
               
                
                
                      }


 

}
                    
         
                           
                    


  

