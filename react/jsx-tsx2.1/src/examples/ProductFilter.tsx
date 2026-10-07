import React from 'react'
export type CategoryFilter = 'all' | 'IT' | '생활';
export type Product={id:number; name:string; category:'IT' | '생활'};

type Props = {items : Product[]; filter : CategoryFilter};
// items, filter 타입은 Props에 정의된 규칙을 따른다.
function ProductFilter({items, filter} : Props) {
   const list =
    filter === 'all' ? items : items.filter((p) => p.category === filter);
  return (
<ul className='list'>
      {list.map((p)=>(
      <li>{p.name} <span className='tag'>{p.category}</span>
      
      </li>
      ))}
    </ul>
  )
}

export default ProductFilter
