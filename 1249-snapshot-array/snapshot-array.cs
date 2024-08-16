public class SnapshotArray
{
    private readonly List<Dictionary<int, int>> _array;
    private int _snapshotId;

    public SnapshotArray(int length)
    {
        _array = new List<Dictionary<int, int>>(length);
        for (var i = 0; i < length; i++)
        {
            _array.Add(new Dictionary<int, int> {[0] = 0});
        }
    }

    public void Set(int index, int val)
    {
        _array[index][_snapshotId] = val;
    }

    public int Snap()
    {
        return _snapshotId++;
    }

    public int Get(int index, int snapId)
    {
        var dictionary = _array[index];
        
        // If snapId is not in the dictionary we should go back to previous snapshot
        while (!dictionary.ContainsKey(snapId))
        {
            --snapId;
        }

        return dictionary[snapId];
    }
}