package pokeslot;

import java.util.Scanner;
import pokeslot.exceptions.ExceptionNotEnoughtPoints;

public class Pokeslot {

    public static void main(String[] args) throws ExceptionNotEnoughtPoints {
        Scanner sc = new Scanner(System.in);
        Player p1 = new Player();
        while (true) {
            System.out.printf("1.Jugar %n2.Ver Tiros %n3.Ver Inventario %n4.Transferir %n");
            try {
                switch (sc.nextInt()) {
                    case 1:
                        Partida(p1);
                        break;
                    case 2:
                        System.out.println(p1.getPuntos());
                        break;
                    case 3:
                        p1.PrintInventario();
                        break;
                    case 4:
                        Transferir(p1);
                }
            } catch (ExceptionNotEnoughtPoints e) {
                System.out.println("No tienes suficientes tiradas");
            }
        }
    }

    private static void Partida(Player p1) throws ExceptionNotEnoughtPoints {
        Tipo dic[] = {Tipo.Comun, Tipo.Comun, Tipo.PocoComun, Tipo.Raro, Tipo.SuperRaro, Tipo.Legendario};
        for (Tipo type : dic) {
            Pokemon aux = p1.Tirar(type);
            if (aux != null) {
                System.out.println("Te ha tocado un " + aux.getNombre());
            } else {
                System.out.println("No te ha tocado nada");
            }
        }
    }

    private static void Transferir(Player p1) {
        Scanner sc = new Scanner(System.in);
        p1.PrintInventario();
        if (p1.getInventario().isEmpty()) {

        } else {
            System.out.println("Que pokemon quieres transferir?");
            String[] a = sc.nextLine().split(" ");

            switch (a.length) {
                case 1 -> p1.Transferir(a[0]);
                case 2 -> p1.Transferir(a[0], Integer.parseInt(a[1]));
            }
            sc.close();
        }
    }
}
