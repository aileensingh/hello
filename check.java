package hello;

import java.util.function.Predicate;

public class check<T> implements Predicate<T>
{
		T value1;
		
		/* constructor */

		check(T _value1) 
		{
			this.value1 = _value1;
		}
		


		@Override
		public boolean test(T t) 
		{
			if(t == value1) 
			{
				return true;
			}
			return false;
		}
}
