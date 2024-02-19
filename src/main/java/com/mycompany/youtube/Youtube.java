/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.youtube;

/**
 *
 * @author HP
 */
public class Youtube {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("rojo");
        Video video = new Video ("aprendiendo java", 2400,"http;//rojo.co" );
        usuario.subirVideo(video);
        usuario.mostrarInfoUsuario();

        
        Usuario usuario2=new Usuario("La Rana Rene");
        Comentario comment1=new Comentario("ta feo el video mi chavo ",usuario2);
        System.out.println("El usuario "+ usuario2.getNombre()+ "  publicó el comentario "+ comment1.getContenido() );

    }
}
