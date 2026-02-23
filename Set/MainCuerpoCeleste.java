package Set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainCuerpoCeleste {

    static Map<String,CuerpoCeleste> sistemaSolar = new HashMap<>();
    static Set<CuerpoCeleste> planetas = new HashSet<>();

    static void main() {
        CuerpoCeleste mercurio = new CuerpoCeleste("Mercurio", 88, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste venus = new CuerpoCeleste("Venus", 225, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste tierra = new CuerpoCeleste("La Tierra", 365, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste marte = new CuerpoCeleste("Marte", 687, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste jupiter = new CuerpoCeleste("Jupiter", 4332, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste saturno = new CuerpoCeleste("Saturno", 10759, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste urano = new CuerpoCeleste("Urano", 30660, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste neptuno = new CuerpoCeleste("Neptuno", 165, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste pluton = new CuerpoCeleste("Pluton", 248, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);


        sistemaSolar.put("Mercurio", mercurio);
        planetas.add(mercurio);
        sistemaSolar.put("Venus", venus);
        planetas.add(venus);
        sistemaSolar.put("La Tierra", tierra);
        planetas.add(tierra);
        sistemaSolar.put("Marte", marte);
        planetas.add(marte);
        sistemaSolar.put("Jupiter", jupiter);
        planetas.add(jupiter);
        sistemaSolar.put("Saturno", saturno);
        planetas.add(saturno);
        sistemaSolar.put("Urano", urano);
        planetas.add(urano);
        sistemaSolar.put("Neptuno", neptuno);
        planetas.add(neptuno);
        sistemaSolar.put("Pluton", pluton);
        planetas.add(pluton);

        Luna luna = new Luna("Luna", 27);
        sistemaSolar.put(luna.getNombre(), luna);
        tierra.addSatelite(luna);
    // lunas de marte
        Luna deimos = new Luna("Deimos", 1.3);
        Luna phobos = new Luna("Phobos", 0.3);
        sistemaSolar.put(deimos.getNombre(), deimos);
        sistemaSolar.put(phobos.getNombre(), phobos);
        marte.addSatelite(deimos);
        marte.addSatelite(phobos);
    //lunas de jupiter
        Luna io = new Luna("Io", 1.8);
        Luna europa = new Luna("Europa", 3.5);
        Luna ganymede = new Luna("Ganymede", 7.1);
        Luna callisto = new Luna("Callisto", 16.7);

        sistemaSolar.put(io.getNombre(), io);
        sistemaSolar.put(europa.getNombre(), europa);
        sistemaSolar.put(ganymede.getNombre(), ganymede);
        sistemaSolar.put(callisto.getNombre(), callisto);

        jupiter.addSatelite(io);
        jupiter.addSatelite(europa);
        jupiter.addSatelite(ganymede);
        jupiter.addSatelite(callisto);

        jupiter.addSatelite(io);
        jupiter.addSatelite(europa);
        jupiter.addSatelite(ganymede);
        jupiter.addSatelite(callisto);

        System.out.println("PLANETAS:");
        for (CuerpoCeleste p : planetas) {
            System.out.println(p.getNombre());
        }

        System.out.println("Lunas de Marte:");
        CuerpoCeleste marteLunas = sistemaSolar.get("Marte");
        for (CuerpoCeleste satelite : marteLunas.getSatelites()) {
            System.out.println(satelite.getNombre());
        }

        Set<CuerpoCeleste> todasLunas = new HashSet<>();
        for (CuerpoCeleste p : planetas) {
            todasLunas.addAll(p.getSatelites());
        }

        System.out.println("Todas las lunas:");
        for (CuerpoCeleste l : todasLunas) {
            System.out.println(l.getNombre());
        }

        System.out.println("Total de todas las lunas: " + todasLunas.size());


        CuerpoCeleste plutonEnano = new CuerpoCeleste("Plutón", 884, CuerpoCeleste.TipoCuerpoCeleste.PLANETA_ENANO);
        planetas.add(plutonEnano);
        sistemaSolar.put(plutonEnano.getNombre(), plutonEnano);

        for (CuerpoCeleste p : planetas) {
            System.out.println(p);
        }

        Set<CuerpoCeleste> lunasMarte = new HashSet<>(marte.getSatelites());
        Set<CuerpoCeleste> lunasJupiter = new HashSet<>(jupiter.getSatelites());

        Set<CuerpoCeleste> intersecion = new HashSet<>(lunasMarte);
        intersecion.retainAll(lunasJupiter);

        Set<CuerpoCeleste> diferencia = new HashSet<>(lunasJupiter);
        diferencia.removeAll(lunasMarte);

        System.out.println("Intersección Marte - Juipiter:");
        System.out.println(intersecion);

        System.out.println("Diferencia Jupiter - Marte):");
        System.out.println(diferencia);
    }
}

