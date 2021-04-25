package com.company;

import java.util.HashMap;

public class AStarState {
    /** This is a reference to the map that the A* algorithm is navigating. **/
    private Map2D map;

    private HashMap<Location, Waypoint> openWaypoints = new HashMap<>();
    private HashMap<Location, Waypoint> closeWaypoints = new HashMap<>();

    /**
     * Initialize a new state object for the A* pathfinding algorithm to use.
     **/
    public AStarState(Map2D map)
    {
        if (map == null)
            throw new NullPointerException("map cannot be null");

        this.map = map;
    }

    /** Returns the map that the A* pathfinder is navigating. **/
    public Map2D getMap()
    {
        return map;
    }

    /**
     Эта функция должна проверить все вершины в наборе открытых вершин,
     и после этого она должна вернуть ссылку на вершину с наименьшей общей
     стоимостью. Если в "открытом" наборе нет вершин, функция возвращает
     NULL.
     Не удаляйте вершину из набора после того, как вы вернули ее; просто
     верните ссылку на точку с наименьшей общей стоимостью
     **/
    public Waypoint getMinOpenWaypoint()
    {
        if (numOpenWaypoints() == 0) {
            return null;
        }

        Waypoint minWaypoint = null;
        float min = Float.MAX_VALUE;

        for (Waypoint waypoint : openWaypoints.values()) {
            float cost = waypoint.getTotalCost();
            if (cost < min) {
                min = cost;
                minWaypoint = waypoint;
            }
        }
        return minWaypoint;
    }

    /**
     Данный метод
     усложняет то, что он должен добавлять указанную вершину только в том
     случае, если существующая вершина хуже новой. Вот что должен делать этот
     метод:
      Если в наборе «открытых вершин» в настоящее время нет вершины
     для данного местоположения, то необходимо просто добавить новую вершину.
      Если в наборе «открытых вершин» уже есть вершина для этой
     локации, добавьте новую вершину только в том случае, если стоимость пути до
     новой вершины меньше стоимости пути до текущей. (Убедитесь, что
     используете не общую стоимость.) Другими словами, если путь через новую
     вершину короче, чем путь через текущую вершину, замените текущую вершину
     на новую
     Как вы могли заметить, что в таком случае вам потребуется извлечь
     существующую вершину из «открытого набора», если таковая имеется. Данный
     шаг довольно прост - замените предыдущую точку на новую, используя метод
     HashMap.put(), который заменит старое значение на новое. Пусть данный метод
     вернет значение true, если новая вершина была успешно добавлена в набор, и
     false в противном случае
     **/
    public boolean addOpenWaypoint(Waypoint newWP)
    {
        Waypoint openWP = openWaypoints.get(newWP.loc);

        if (openWP == null || newWP.getPreviousCost() < openWP.getPreviousCost()) {
            openWaypoints.put(newWP.loc, newWP);
            return true;
        }
        return false;
    }


    /** Возвращает количество точек в наборе открытых вершин. **/
    public int numOpenWaypoints() {
        return openWaypoints.size();
    }


    /**
     Эта функция перемещает вершину из набора «открытых вершин» в набор
     «закрытых вершин». Так как вершины обозначены местоположением, метод
     принимает местоположение вершины.
     **/
    public void closeWaypoint(Location loc)
    {
        Waypoint waypoint = openWaypoints.remove(loc);
        if (openWaypoints != null) {
            closeWaypoints.put(loc, waypoint);
        }
    }

    /**
     *Эта функция должна возвращать значение true, если указанное
     * местоположение встречается в наборе закрытых вершин, и false в противном случае
     **/
    public boolean isLocationClosed(Location loc)
    {
        return closeWaypoints.containsKey(loc);
    }
}
