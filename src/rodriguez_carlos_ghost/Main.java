package rodriguez_carlos_ghost;

import javax.swing.JOptionPane;

public class Main extends MenuEntrada{    
    public boolean MenuM (String ActualJ, String contraseña) {
        
       
        while (true){
        int opcion2 = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido\n"
                + "Favor selecione una opcion\n"
                + "1. Jugar Ghost\n"
                + "2. Configuracion\n"
                + "3. Reportes\n"
                + "4. Mi Perfil\n"
                + "5. Salida"));
        
            if (opcion2 == 5) {
                JOptionPane.showMessageDialog(null, "Regresando.............Listo");
                break;
            }
        
        
        switch (opcion2){
            
            case 1:{
                GhostLauncher ghost = new GhostLauncher();
                ghost.iniciar_juego();
              
                
                
                break;
                
            }
            case 2:{
                
                
                break;   
            }
            case 3:{
                
                
                break;
            }
            case 4:{
                
                
                break;
            }
            default: 
                JOptionPane.showMessageDialog(null, "ERROR....... Opción No válida, favor intente nuevamente.","a", JOptionPane.ERROR_MESSAGE);
        }
        
        
        }
        return (true);
    }


    
}

    
    

    

    

    
