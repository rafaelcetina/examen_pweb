package Multiplicacion;

import com.mysql.jdbc.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael
 */

public class Multiplicacion {
    int limite, suma =0;
    public Multiplicacion(){
        this.limite = 10;
    }
    
    public Multiplicacion(int limite){
        this.limite = limite;
    }
    
    public int getLimite(){
        return this.limite;
    }
    
    public int multiplica(int num, int i){
        return num * i;
    }
    
    public int sumatoria(int res){
        return this.suma+= res;
    }
    
    public int getSuma(){
        return this.suma;
    }
    /*
    public void conexion(){
        Connection con = new Connection('root','');
    }*/
}