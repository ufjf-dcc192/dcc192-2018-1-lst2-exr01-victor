/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc192;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author ice
 */
public class ListaDeUsuarios {

    private static List<Usuario> Usuarios;
    private static List<Figurinha> Figurinhas;
    private static Integer autoIncrementoUsuario;

    public static Integer criarNovoUsuario(String nome) {
        Usuario novoUsuario = new Usuario(autoIncrementoUsuario, nome);
        Usuarios.add(novoUsuario);
        return autoIncrementoUsuario++;
    }

    public static void removerUsuario(Integer id) {
        Usuarios.remove(getUsuarioById(id));
    }

    public static Usuario getUsuarioById(Integer id) {
        for (Usuario Usuario : Usuarios) {
            if (Usuario.getId().equals(id)) {
                return Usuario;
            }
        }
        return null;
    }

    public static List<Usuario> getInstance() {
        if (Usuarios == null) {
            autoIncrementoUsuario = 4;
            Usuarios = new ArrayList<>();
            Figurinhas = getInstanceFigurinhas();
            
            Usuarios.add(new Usuario(1, "nome 1"));
            Usuarios.add(new Usuario(2, "nome 2"));
            Usuarios.add(new Usuario(3, "nome 3"));

            for (Usuario usuario : Usuarios) {
                for (Integer i=0; i<20; i++) {
                    Random gerador = new Random();
                    Figurinha aux = Figurinhas.get(gerador.nextInt(Figurinhas.size()));
                    usuario.addFigurinhas(aux);
                }
            }
        }
        return Usuarios;
    }
    
    public static List<Figurinha> getInstanceFigurinhas() {
        if (Figurinhas == null) {
            Figurinhas = new ArrayList<>();
            Figurinhas.add(new Figurinha(1, "aaa"));
            Figurinhas.add(new Figurinha(2, "bbb"));
            Figurinhas.add(new Figurinha(3, "ccc"));
            Figurinhas.add(new Figurinha(4, "ddd"));
            Figurinhas.add(new Figurinha(5, "eee"));
            Figurinhas.add(new Figurinha(6, "fff"));
            Figurinhas.add(new Figurinha(7, "ggg"));
            Figurinhas.add(new Figurinha(8, "hhh"));
            Figurinhas.add(new Figurinha(9, "iii"));
            Figurinhas.add(new Figurinha(10, "jjj"));
            Figurinhas.add(new Figurinha(11, "kkk"));
            Figurinhas.add(new Figurinha(12, "lll"));
        }
        
        return Figurinhas;
    }
}
