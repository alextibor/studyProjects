using System;

namespace ConsoleTimeLoser.Model
{
    public class TimeEntry
    {
        public DateTime timeEntry { get; set; }

        public override string ToString()
        {
            return $"{nameof(timeEntry)}: {timeEntry}";
        }
    }
}