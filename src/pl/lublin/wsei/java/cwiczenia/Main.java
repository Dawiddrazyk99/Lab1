public  static String shuffle (String word){
        StringBuilder builder = new StringBuilder();
        Random random = new Random();

        for(int i = word.length() - 1; i >= 0; i--){
        int index = random.nextInt(i);

        builder.append(word.charAt(index));
        word = word.substring(0, index) + word.substring(index + 1);
        }

        return builder.toString();
        }