import React from 'react';
import ReactDOM from 'react-dom/client';
import { RecoilRoot } from 'recoil';
import './index.css';
import Counter from './Counter';

ReactDOM.render(
  <RecoilRoot>
    <Counter />
  </RecoilRoot>,
  document.getElementById('root')
);