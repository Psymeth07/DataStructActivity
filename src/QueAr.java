class QueAr
   {
   public int maxSize;
   public long[] queArray;
   public int front;
   public int rear;
   public int nItems;
   public QueAr(int s)          
      {
      maxSize = s;
      queArray = new long[maxSize];
      front = 0;
      rear = -1;
      nItems = 0;
      }
   public void insert(long j)   
      {
      if(rear == maxSize-1)        
         rear = -1;
      queArray[++rear] = j;         
      nItems++;                    
      }
   public long remove()       
      {
      long temp = queArray[front++]; 
      if(front == maxSize)           
         front = 0;
      nItems--;                     
      return temp;
      }
   public long peekFront()      
      {
      return queArray[front];
      }
   public boolean isEmpty()    
      {
      return (nItems==0);
      }
   public boolean isFull()     
      {
      return (nItems==maxSize);
      }
   public int size()          
      {
      return nItems;
      }
   }  
class QueueApp
   {
// end main()
   }