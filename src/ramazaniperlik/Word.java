package ramazaniperlik;

import java.util.ArrayList;

    public class Word {

        private static String word = "code";
        private ArrayList<Integer> findIndis = new ArrayList<>();;

        public ArrayList<Integer> getFindIndis() {
            return findIndis;
        }

        //Küçük harfe dönüştürülmüş stringlerden word kelimesini içerenlerin
        //indis değerini arrayList'e yazan metot.
        public void findIndis(String[] newString) {

            for(int i=0; i < newString.length; i++){
                if(newString[i].contains(word)){
                    findIndis.add(i);
                }
            }
        }

        //List metoduna gönderilen String[] parametresindeki değerleri küçük harfe dönüştüren metot.
        public void parseLower(String[] words) {

           ArrayList<String> parseString = new ArrayList<>();

            for (String word : words)
                parseString.add(word.toLowerCase());

            String[] parsedString = new String[parseString.size()];
            parsedString = parseString.toArray(parsedString);

            findIndis(parsedString);
        }


        //Main tarafından ilk parametre gönderilen metot,
        // Find metoduyla bulunan indis değerlerindeki stringleri listeleyen metot.
        public String[] List(String[] words) {

            parseLower(words);
            ArrayList<String> newWords = new ArrayList<>();

                for (int indisNo : this.findIndis) {
                    newWords.add(words[indisNo]);
                }

                String[] newString2 = new String[newWords.size()];
                newString2 = newWords.toArray(newString2);

            return newString2;
            }
        }
