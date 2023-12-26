package easy;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class PathCrossing {

    public boolean isPathCrossing(String path) {

        Set<Point> set = new HashSet<>();
        Point location = new Point();
        set.add(location);

        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'N') {
                location = new Point(location.x, location.y + 1);
                if (set.contains(location)) {
                    return true;
                }
                set.add(location);
            } else if (path.charAt(i) == 'E') {
                location = new Point(location.x + 1, location.y);
                if (set.contains(location)) {
                    return true;
                }
                set.add(location);
            } else if (path.charAt(i) == 'S') {
                location = new Point(location.x, location.y - 1);
                if (set.contains(location)) {
                    return true;
                }
                set.add(location);
            } else {
                location = new Point(location.x - 1, location.y);
                if (set.contains(location)) {
                    return true;
                }
                set.add(location);
            }
        }

        return false;
    }
}
