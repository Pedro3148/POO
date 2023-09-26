package atividade6;

import atividade6.parque.Passaporte;

class Executavel {
            public static void main(String[] args) {
        
           // Gerente ger1 = new Gerente("pessoa", 71020, 932320084, 20);
           // System.out.println(ger1);
            Passaporte passaporte = new Passaporte(150.0, 7);
            double precoPassaporte = passaporte.calcularPreco();
            int diasValidade = passaporte.getDiasValidade();

             System.out.println("Preço do passaporte: " + precoPassaporte);
             System.out.println("Dias de validade do passaporte: " + diasValidade);
        }
        }
      

