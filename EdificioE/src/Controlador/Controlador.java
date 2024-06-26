package Controlador;

import Modelo.ElementosGrafo.Espacio;
import Modelo.ElementosEdificio.Edificio;
import Modelo.ElementosEdificio.Piso;
import Modelo.ElementosEdificio.FachadaCreacionEdificio;
import Modelo.ElementosGrafo.GrafoPanel;
import Modelo.ElementosGrafo.Arista;

import Vista.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Controlador implements ActionListener{
    
    private final MenuCreacion menuCreacion;
    private final Simulacion simulacion = new Simulacion();
    private final FachadaCreacionEdificio fachada = FachadaCreacionEdificio.getFachada();
    
    //Constructor controlador
    public Controlador(MenuCreacion ventana){
        this.menuCreacion = ventana;
        
        this.menuCreacion.Simular.addActionListener(e -> actionPerformed(e));
        
        this.simulacion.simularPiso.addActionListener(e -> actionPerformed(e));
        this.simulacion.simularHabitacion.addActionListener(e -> actionPerformed(e));
        this.simulacion.recomendacionesPiso.addActionListener(e -> actionPerformed(e));
    }
    
    //Método para iniciar la ventana del menú
    public void iniciar() {
        menuCreacion.setVisible(true);
        menuCreacion.setEnabled(true);
        menuCreacion.setLocationRelativeTo(null);
        menuCreacion.setTitle("Proyecto Final - Habitabilidad Edificio");
        menuCreacion.setResizable(false);
    }
    
    //Métódo para iniciar la ventana de simulación
    public void iniciarVentanaSimulacion() {
        simulacion.setVisible(true);
        simulacion.setEnabled(true);
        simulacion.setLocationRelativeTo(null);
        simulacion.setTitle("Proyecto Final - Habitabilidad Edificio");
        simulacion.setResizable(false);
    }
    
    //Método para inicializar el edificio
    public void crearEdificio(int cantidadPisos){
        this.fachada.crearEdificio("Continental", cantidadPisos);
    }
    
    public GrafoPanel crearGrafoPisos(Piso piso) {
        // Crear y retornar el panel del grafo
        return new GrafoPanel(piso.getNodos(), piso.getAristas());
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == menuCreacion.Simular){
            //Inicialización de los valores en memoria
            this.crearEdificio(Integer.parseInt(menuCreacion.cantidadPisos.getText()));
            //Cerrar ventana de creación
            menuCreacion.setVisible(false);
            this.iniciarVentanaSimulacion();
        }
        
        if (e.getSource() == simulacion.simularPiso) {
            Edificio miEdificio = this.fachada.getEdificio();
            try{
                Piso piso = miEdificio.getPisos().get(Integer.parseInt(simulacion.targetPiso.getText())-1);
                GrafoPanel grafoPisos;
                grafoPisos = crearGrafoPisos(piso);
                simulacion.setDisplayPanel(grafoPisos);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Ingrese un número de piso válido");
            }

        }

        if(e.getSource() == simulacion.simularHabitacion){
            Edificio miEdificio = this.fachada.getEdificio();
            try{
                Espacio habitacion = miEdificio.getPisos().get(Integer.parseInt(simulacion.targetPiso.getText())-1).getNodos().get(Integer.parseInt(simulacion.targetHabitacion.getText()));
                MostrarHabitacionPanel panelHabitacion = new MostrarHabitacionPanel(habitacion);
                simulacion.setDisplayPanel(panelHabitacion);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Ingrese un número de habitación válido");
            }          
        }
        
        if (e.getSource() == simulacion.recomendacionesPiso) {
            Edificio miEdificio = this.fachada.getEdificio();
            simulacion.boxRecomendacion.setText("Recomendaciones del piso - " + Integer.valueOf(simulacion.targetPiso.getText()) + "\n");
            // Encontrar conexiones RED-GREEN
            List<String> conexiones = miEdificio.getPisos().get(Integer.parseInt(simulacion.targetPiso.getText()) - 1).conexionNodosRojosVerdes();
            // Imprimir las conexiones encontradas
            for (String conexion : conexiones) {
                simulacion.boxRecomendacion.append(conexion + "\n");
            }
        }

    } 
}
