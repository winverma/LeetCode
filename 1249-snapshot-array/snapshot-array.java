import java.util.HashMap;
import java.util.Map;

class SnapshotArray 
{
    private Map<Integer, Integer>[] snapshots;
    private int snapId;

    public SnapshotArray(int length) 
    {
        snapshots = new HashMap[length];
        for (int i = 0; i < length; i++) 
        {
            snapshots[i] = new HashMap<>();
            snapshots[i].put(0, 0); // Initializing with snapId 0 and value 0
        }
        snapId = 0;
    }

    public void set(int index, int val) 
    {
        snapshots[index].put(snapId, val);
    }

    public int snap() 
    {
        snapId++;
        return snapId - 1;
    }

    public int get(int index, int snap_id) 
    {
        // Find the value in the nearest snapshot less than or equal to snap_id
        while (!snapshots[index].containsKey(snap_id)) 
        {
            snap_id--;
        }
        return snapshots[index].get(snap_id);
    }
}
