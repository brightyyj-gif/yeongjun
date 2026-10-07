import React from 'react'

export type CardTone = 'a' | 'b' | 'c' ;

export type CardItem = {
    id:number;
     title: string;
    desc: string;
    tag: string;
    price: number;
    tone: CardTone;
};
type  CardListProps = {
    cards : CardItem[];
    onSelect: (card: CardItem) => void;
    //자식컴포넌트(카드목록) 에서 어떤카드가 선택되었는지 부모
    //컴포넌로 알려줄때
};
//onSelect -props
// (card: CardItem) -> CardItem 하나를 매개 변수로 받는다.

function CardList({cards, onSelect} : CardListProps) {
  return (
     <div className="card-grid">
      {cards.map((card) => (
        <article key={card.id} className="card">
          <div className={`card-thumb tone-${card.tone}`} />
          <div className="card-body">
            <span className="card-tag">{card.tag}</span>
            <h3>{card.title}</h3>
            <p>{card.desc}</p>
            <p className="card-price">{card.price.toLocaleString()}원</p>
            <button type="button" className="btn" onClick={() => onSelect(card)}>
              선택
            </button>
          </div>
        </article>
      ))}
    </div>
  )
}

export default CardList