import { useState, useMemo } from 'react';

const books = [
  { id: 1, title: '자바의 정석', author: '남궁성', genre: 'IT' },
  { id: 2, title: '토비의 스프링', author: '이일민', genre: 'IT' },
  { id: 3, title: '데미안', author: '헤르만 헤세', genre: '소설' },
  { id: 4, title: '어린 왕자', author: '생텍쥐페리', genre: '소설' },
  { id: 5, title: '클린 코드', author: '로버트 마틴', genre: 'IT' },
];

function Practice04BookSearch() {
  const [keyword, setKeyword] = useState('');
  const [genre, setGenre] = useState('전체');

  const filteredBooks = useMemo(() => {
    console.log('📚 도서 필터링');

    return books.filter((book) => {
      const keywordMatch = book.title.includes(keyword);
      const genreMatch =
        genre === '전체' || book.genre === genre;

      return keywordMatch && genreMatch;
    });
  }, [keyword, genre]);

  return (
    <div className="panel">
      <h2>④ 📚 도서 검색</h2>

      <p className="goal">
        학습: useState · filter · useMemo · 조건부 렌더링
      </p>

      {/* 검색 영역 가운데 정렬 */}
      <div
        style={{
          display: 'flex',
          justifyContent: 'center',
          alignItems: 'center',
          gap: '10px',
          marginBottom: '20px',
        }}
      >
        <input
          type="text"
          value={keyword}
          onChange={(e) => setKeyword(e.target.value)}
          placeholder="도서 제목 검색"
        />

        <label htmlFor="genre">장르</label>

        <select
          id="genre"
          value={genre}
          onChange={(e) => setGenre(e.target.value)}
        >
          <option value="전체">전체</option>
          <option value="IT">IT</option>
          <option value="소설">소설</option>
        </select>
      </div>

      {/* 검색 결과 가운데 정렬 */}
      <div style={{ textAlign: 'center' }}>
        {filteredBooks.length > 0 ? (
          filteredBooks.map((book) => (
            <div key={book.id} style={{ marginBottom: '10px' }}>
              <strong>{book.title}</strong>
              <span> — </span>
              <span>{book.author}</span>
            </div>
          ))
        ) : (
          <p>검색 결과가 없습니다.</p>
        )}
      </div>

      <div className="hint">
        핵심: <code>[keyword, genre]</code>가 변경될 때만
        도서 필터링이 다시 실행됩니다.
      </div>
    </div>
  );
}

export default Practice04BookSearch;
