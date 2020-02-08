/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplojpa.test;

import com.ejemplojpa.modelo.Alumno;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author iarog
 */
public class Test {
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("clases");
        EntityManager em = emf.createEntityManager();
        Alumno alumno = em.find(Alumno.class, 1);
        System.out.println(alumno.toString());
        em.close();
        emf.close();
    }
}
