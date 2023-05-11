package control;

import java.util.List;
import mongoconexion.conexion;
import org.bson.Document;

public class publicacionesController {

    conexion mongoDB = new conexion();
    
    public boolean NuevaPublicacion(Document dbo){
        return mongoDB.NuevaPublicacion(dbo);
    }
    
    public List<Document> listarPublicaciones(){
        return mongoDB.listarPublicaciones();
    }
    
    public List<Document> listarPublicacionesFiltro(Document dbo){
        return mongoDB.listarPublicacionesFiltro(dbo);
    }
    
}
