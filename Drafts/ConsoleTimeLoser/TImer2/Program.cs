using System;
using System.Timers;

//https://www.youtube.com/watch?v=GNyeojGBqmQ

namespace TImer2
{
    class Program
    {
        public static int secondsCounter = 0;
        public static Timer aTimer = new Timer(1000);
        static void Main(string[] args)
        {
            aTimer.Elapsed += ATimerOnElapsed;
            aTimer.Enabled = true;
            aTimer.AutoReset = true;
            aTimer.Start();
            Console.ReadKey();
        }

        private static void ATimerOnElapsed(object sender, ElapsedEventArgs e)
        {
            secondsCounter++;
            Console.WriteLine(secondsCounter + " Seconds");
            //throw new NotImplementedException();
        }
    }
} 