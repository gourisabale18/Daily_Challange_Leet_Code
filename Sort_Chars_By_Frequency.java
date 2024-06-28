
class Pair
{
    char letter;
    int no;


    public Pair(char letter, int no)
    {
        this.letter=letter;
        this.no=no;
    }
}

class Solution {
    public String frequencySort(String s) {

        MapCharacter,Integer hmap=new HashMap();

    for(int i=0;is.length();i++)
    {

      char ch=s.charAt(i);
      if(!hmap.containsKey(ch))
      {
        hmap.put(ch,1);
      }
      else
      {
        int cnt=hmap.get(ch);
        hmap.put(ch,cnt+1);
      }

    }
    System.out.println(hmap);

    sort based on second element value
    PriorityQueuePair pq=new PriorityQueue((a,b)-b.no-a.no);

    for(Map.EntryCharacter,Integerentry hmap.entrySet())
    {
        pq.add(new Pair(entry.getKey(),entry.getValue()));

    }

   
    StringBuilder sb=new StringBuilder();


    while(!pq.isEmpty())
    {
        Pair x= pq.poll();
        char ch=x.letter;
        int cnt=x.no;

        while(cnt!=0)
        {
            sb.append(ch);
            cnt--;
        }
    }
    return sb.toString();
        
    }
}