class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Arrays.sort(words);
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> mp = new HashMap<>();
        int j = 0;
        for (String c : words) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            if (mp.containsKey(c)) {
                if (mp.get(c) >= j)
                    mp.put(c, j);

            } else
                mp.put(c, j);
            j++;
        }
     
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            if (b.freq != a.freq) {
                return b.freq - a.freq;
            } else {
                return mp.get(a.word) - mp.get(b.word);
            }
        });

        for (String s : map.keySet()) {

            pq.add(new Pair(s, map.get(s)));
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list.add(pq.poll().word);
        }
        return list;
    }
}

class Pair {
    String word;
    int freq;

    Pair(String word, int freq) {
        this.word = word;
        this.freq = freq;
    }

}
