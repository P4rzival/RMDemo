public class Prime {
    static boolean isPrime(int num)
    {
        if (num >= 2)
        {
            if (num != 2 && num % 2 == 0)
            {
                return false;
            }

            for (int i = 3; i <= Math.sqrt(num); i++)
            {
                if (num % i ==0)
                {
                    return false;
                }
            }

            return true;
        }
        return false;
    }
}
