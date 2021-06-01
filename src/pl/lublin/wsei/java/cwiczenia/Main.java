public  static  String camelize(String word){
        StringBuilder builder = new StringBuilder();

        String[] words = word.split(" ");
        builder.append(words[0].toLowerCase());

        for(int i = 1; i < words.length; i++){
        String stringToAdd = words[i].substring(1).toLowerCase();

        builder.append(Character.toUpperCase(words[i].charAt(0)));
        builder.append(stringToAdd);
        }

        return builder.toString();
        }