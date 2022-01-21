using System;
using System.Globalization;
using System.Reflection.Metadata;
using System.Timers;

//https://www.youtube.com/watch?v=2tyKPpoLV94

namespace ConsoleTimeLoser
{
    class Program
    {
        static void Main(string[] args)
        {
            Timer timer = new Timer(1000);
            timer.Elapsed += TimerOnElapsed;
            
            timer.Start();
            
            Console.ReadKey();
            timer.Stop();
        }

        private static void TimerOnElapsed(object sender, ElapsedEventArgs e)
        {
            Console.WriteLine(DateTime.Now.ToString(CultureInfo.InvariantCulture));
        }
    }
}