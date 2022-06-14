/*
File: MainModel.java
Author: Tamás Domán
Copyright: 2022, Tamás Domán
Group: Szoft I N
Date: 2022-06-14
Github: https://github.com/DomanTom07/
Licenc: GNU GPL
*/

package models;

import java.util.Arrays;
import java.util.Vector;

public class MainModel {
    Position[] positionArray = {
        new Position(1, "Szoftverfejlesztő"),
        new Position(2, "Szoftvertesztelő"),
        new Position(3, "Rendszergazda"),
        new Position(4, "Tanár"),
        new Position(5, "Igazgató"),
        new Position(6, "Titkár"),
        new Position(7, "Takarító"),
        new Position(8, "Taxisofőr"),
        new Position(9, "Kalauz"),
        new Position(10, "Munkanélküli"),
    };

    public Vector<Position> positionVector = new Vector<>(Arrays.asList(positionArray));
}
