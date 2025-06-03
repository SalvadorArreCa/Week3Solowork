class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> matriz = new ArrayList<>();
        
        int contador[] = new int[nums.length + 1];

        for(int valor : nums) {
            if(matriz.size() < contador[valor] + 1)
                matriz.add(new ArrayList<>());
            matriz.get(contador[valor]).add(valor);
            contador[valor]++; 
        }
        
        return matriz;
    }
}
