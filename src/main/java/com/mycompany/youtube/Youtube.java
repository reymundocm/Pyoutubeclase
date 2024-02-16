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
        Usuario usuario = new Usuario("limon");
        Video video = new Video ("aprendiendo java", 2400,"http;//limom.co" );
        usuario.subirVideo(video);
        usuario.mostrarInfoUsuario();
    }
}
