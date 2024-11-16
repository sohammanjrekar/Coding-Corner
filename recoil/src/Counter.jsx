import React from 'react';
import { useRecoilState } from 'recoil';
import { countState } from './store/counterAtom';

function Counter() {
  const [count, setCount] = useRecoilState(countState);

  return (
    <div>
      <p>Count: {count}</p>
      <button onClick={() => setCount(count + 1)}>Increment</button>
    </div>
  );
}

export default Counter;