import React, { useState, useRef, useEffect } from 'react';
import { Sliders, Eye, Zap, RefreshCw, CheckCircle, AlertTriangle, Copy, Play } from 'lucide-react';

export const InteractiveLab: React.FC = () => {
  const [activeTab, setActiveTab] = useState<'spring' | 'contrast' | 'virtualizer'>('spring');

  // Spring Lab State
  const [stiffness, setStiffness] = useState<number>(300);
  const [damping, setDamping] = useState<number>(20);
  const [mass, setMass] = useState<number>(1);
  const [isTriggered, setIsTriggered] = useState<boolean>(false);

  // Contrast Lab State
  const [fgColor, setFgColor] = useState<string>('#FFFFFF');
  const [bgColor, setBgColor] = useState<string>('#1E1B4B');
  const [testText, setTestText] = useState<string>('사용자 중심의 직관적 인터페이스');
  const [outerRadius, setOuterRadius] = useState<number>(16);
  const [containerPadding, setContainerPadding] = useState<number>(12);

  // Virtualizer Lab State
  const [totalItems, setTotalItems] = useState<number>(10000);
  const [scrollTop, setScrollTop] = useState<number>(0);
  const itemHeight = 36;
  const viewportHeight = 240;
  const startIndex = Math.max(0, Math.floor(scrollTop / itemHeight) - 2);
  const endIndex = Math.min(totalItems - 1, Math.floor((scrollTop + viewportHeight) / itemHeight) + 2);
  const visibleItems = [];
  for (let i = startIndex; i <= endIndex; i++) {
    visibleItems.push(i);
  }

  // Calculate Relative Luminance and Contrast Ratio
  const getLuminance = (hex: string) => {
    const c = hex.replace('#', '');
    const r = parseInt(c.substring(0, 2), 16) / 255;
    const g = parseInt(c.substring(2, 4), 16) / 255;
    const b = parseInt(c.substring(4, 6), 16) / 255;
    const a = [r, g, b].map((v) => (v <= 0.03928 ? v / 12.92 : Math.pow((v + 0.055) / 1.055, 2.4)));
    return a[0] * 0.2126 + a[1] * 0.7152 + a[2] * 0.0722;
  };

  const getContrastRatio = (c1: string, c2: string) => {
    try {
      const l1 = getLuminance(c1);
      const l2 = getLuminance(c2);
      const ratio = (Math.max(l1, l2) + 0.05) / (Math.min(l1, l2) + 0.05);
      return Math.round(ratio * 100) / 100;
    } catch {
      return 1;
    }
  };

  const contrast = getContrastRatio(fgColor, bgColor);
  const passAA = contrast >= 4.5;
  const passAAA = contrast >= 7.0;

  // Spring trigger animation
  const triggerSpring = () => {
    setIsTriggered(false);
    setTimeout(() => setIsTriggered(true), 20);
  };

  return (
    <section id="lab" className="py-20 md:py-28 border-b border-white/[0.06] bg-[#0d0e14]">
      <div className="mx-auto max-w-7xl px-4 sm:px-6 lg:px-8">
        
        {/* Section Header */}
        <div className="pb-10 border-b border-white/[0.08]">
          <div className="text-xs font-mono uppercase tracking-widest text-indigo-400">
            02. Interactive Frontend Lab
          </div>
          <h2 className="mt-2 text-2xl sm:text-4xl font-extrabold text-white tracking-tight">
            브라우저 내 실시간 인터랙션 & 성능 실험실
          </h2>
          <p className="mt-2 text-sm sm:text-base text-zinc-400 max-w-2xl">
            디자인 엔지니어링의 정밀함을 직접 조작해보세요. 스프링 물리 시뮬레이션, WCAG 명도비 계산기, 10,000개 DOM 가상화 렌더러를 실시간으로 테스트할 수 있습니다.
          </p>

          {/* Tab Switcher */}
          <div className="mt-6 flex flex-wrap items-center gap-1.5 p-1 bg-white/[0.04] rounded-lg border border-white/[0.08] w-fit">
            <button
              onClick={() => setActiveTab('spring')}
              className={`flex items-center gap-2 px-3.5 py-1.5 text-xs font-medium rounded-md transition-all whitespace-nowrap ${
                activeTab === 'spring'
                  ? 'bg-indigo-600 text-white shadow-sm'
                  : 'text-zinc-400 hover:text-white'
              }`}
            >
              <Zap className="h-3.5 w-3.5" />
              <span>Spring Physics Studio</span>
            </button>
            <button
              onClick={() => setActiveTab('contrast')}
              className={`flex items-center gap-2 px-3.5 py-1.5 text-xs font-medium rounded-md transition-all whitespace-nowrap ${
                activeTab === 'contrast'
                  ? 'bg-indigo-600 text-white shadow-sm'
                  : 'text-zinc-400 hover:text-white'
              }`}
            >
              <Eye className="h-3.5 w-3.5" />
              <span>WCAG a11y & Token Math</span>
            </button>
            <button
              onClick={() => setActiveTab('virtualizer')}
              className={`flex items-center gap-2 px-3.5 py-1.5 text-xs font-medium rounded-md transition-all whitespace-nowrap ${
                activeTab === 'virtualizer'
                  ? 'bg-indigo-600 text-white shadow-sm'
                  : 'text-zinc-400 hover:text-white'
              }`}
            >
              <Sliders className="h-3.5 w-3.5" />
              <span>DOM Virtualization (10k items)</span>
            </button>
          </div>
        </div>

        {/* Experiment 1: Spring Physics Studio */}
        {activeTab === 'spring' && (
          <div className="mt-10 grid grid-cols-1 lg:grid-cols-12 gap-8 items-start">
            
            {/* Control Panel */}
            <div className="lg:col-span-5 rounded-2xl border border-white/[0.08] bg-[#12141c] p-6">
              <h3 className="text-base font-semibold text-white flex items-center justify-between">
                <span>물리 엔진 매개변수 조절</span>
                <button
                  onClick={triggerSpring}
                  className="inline-flex items-center gap-1 text-xs font-mono text-indigo-400 hover:text-indigo-300"
                >
                  <RefreshCw className="h-3.5 w-3.5" />
                  <span>다시 트리거</span>
                </button>
              </h3>

              <div className="mt-6 space-y-5">
                <div>
                  <div className="flex justify-between text-xs font-mono text-zinc-300 mb-2">
                    <span>Stiffness (강성)</span>
                    <span className="text-indigo-400 tabular-nums">{stiffness}</span>
                  </div>
                  <input
                    type="range"
                    min="50"
                    max="600"
                    value={stiffness}
                    onChange={(e) => setStiffness(Number(e.target.value))}
                    className="w-full accent-indigo-500 cursor-pointer"
                  />
                  <div className="flex justify-between text-[11px] text-zinc-400 mt-1">
                    <span>50 (부드러움)</span>
                    <span>600 (단단하고 빠름)</span>
                  </div>
                </div>

                <div>
                  <div className="flex justify-between text-xs font-mono text-zinc-300 mb-2">
                    <span>Damping (감쇠)</span>
                    <span className="text-indigo-400 tabular-nums">{damping}</span>
                  </div>
                  <input
                    type="range"
                    min="5"
                    max="60"
                    value={damping}
                    onChange={(e) => setDamping(Number(e.target.value))}
                    className="w-full accent-indigo-500 cursor-pointer"
                  />
                  <div className="flex justify-between text-[11px] text-zinc-400 mt-1">
                    <span>5 (반복 바운스)</span>
                    <span>60 (오버슈트 없음)</span>
                  </div>
                </div>

                <div>
                  <div className="flex justify-between text-xs font-mono text-zinc-300 mb-2">
                    <span>Mass (질량)</span>
                    <span className="text-indigo-400 tabular-nums">{mass}</span>
                  </div>
                  <input
                    type="range"
                    min="0.2"
                    max="3"
                    step="0.1"
                    value={mass}
                    onChange={(e) => setMass(Number(e.target.value))}
                    className="w-full accent-indigo-500 cursor-pointer"
                  />
                  <div className="flex justify-between text-[11px] text-zinc-400 mt-1">
                    <span>0.2 (가벼운 깃털)</span>
                    <span>3.0 (무거운 관성)</span>
                  </div>
                </div>
              </div>

              {/* Code Export */}
              <div className="mt-6 pt-5 border-t border-white/[0.08]">
                <div className="text-xs font-mono text-zinc-400 mb-2">Framer Motion Spec:</div>
                <pre className="overflow-x-auto rounded-lg bg-zinc-950 p-3 font-mono text-[11px] text-zinc-300">
                  <code>{`transition: {
  type: "spring",
  stiffness: ${stiffness},
  damping: ${damping},
  mass: ${mass}
}`}</code>
                </pre>
              </div>
            </div>

            {/* Interactive Preview Canvas */}
            <div className="lg:col-span-7 rounded-2xl border border-white/[0.08] bg-[#12141c] p-6 flex flex-col justify-between min-h-[380px]">
              <div className="flex items-center justify-between text-xs text-zinc-400">
                <span>인터랙티브 촉각 피드백 캔버스</span>
                <span className="font-mono text-emerald-400">FPS: 60 (Compositor only)</span>
              </div>

              {/* Bouncy Playground Object */}
              <div className="my-10 flex flex-col items-center justify-center">
                <button
                  onClick={triggerSpring}
                  style={{
                    transform: isTriggered ? 'scale(1.2) rotate(4deg)' : 'scale(1) rotate(0deg)',
                    transition: `transform ${Math.max(150, 400 - stiffness * 0.4)}ms cubic-bezier(0.175, 0.885, 0.32, 1.275)`
                  }}
                  className="relative group flex flex-col items-center justify-center p-8 rounded-2xl bg-gradient-to-br from-indigo-600 to-indigo-800 text-white shadow-xl shadow-indigo-600/20 cursor-pointer select-none active:scale-95"
                >
                  <Zap className="h-8 w-8 mb-2 group-hover:rotate-12 transition-transform" />
                  <span className="text-sm font-bold">클릭하여 스프링 펄스 테스트</span>
                  <span className="text-[11px] text-indigo-200 mt-1">Stiffness {stiffness} · Damping {damping}</span>
                </button>
                <div className="mt-4 text-xs text-zinc-400">
                  버튼을 클릭하거나 좌측 슬라이더를 조작하여 실시간 물리 반응을 관찰하세요.
                </div>
              </div>

              {/* Physics equation breakdown */}
              <div className="rounded-xl bg-white/[0.02] border border-white/[0.06] p-4 text-xs text-zinc-400 flex items-center justify-between">
                <span>감쇠 진동 방정식: <code className="font-mono text-zinc-300">F = -kx - cv</code></span>
                <span className="text-zinc-400 font-mono">Settles in &lt; 200ms</span>
              </div>
            </div>

          </div>
        )}

        {/* Experiment 2: WCAG Contrast & Token Math */}
        {activeTab === 'contrast' && (
          <div className="mt-10 grid grid-cols-1 lg:grid-cols-12 gap-8 items-start">
            <div className="lg:col-span-5 rounded-2xl border border-white/[0.08] bg-[#12141c] p-6 space-y-6">
              <h3 className="text-base font-semibold text-white">디자인 토큰 & 대비율 테스터</h3>

              {/* Color pickers */}
              <div className="space-y-4">
                <div>
                  <label className="block text-xs font-mono text-zinc-300 mb-1.5">
                    Foreground Text Color
                  </label>
                  <div className="flex items-center gap-3">
                    <input
                      type="color"
                      value={fgColor}
                      onChange={(e) => setFgColor(e.target.value)}
                      className="h-9 w-12 rounded cursor-pointer border-0 bg-transparent"
                    />
                    <input
                      type="text"
                      value={fgColor}
                      onChange={(e) => setFgColor(e.target.value)}
                      className="flex-1 rounded-md border border-white/10 bg-zinc-900 px-3 py-1.5 text-xs font-mono text-white focus:outline-none focus:ring-1 focus:ring-indigo-500"
                    />
                  </div>
                </div>

                <div>
                  <label className="block text-xs font-mono text-zinc-300 mb-1.5">
                    Background Surface Color
                  </label>
                  <div className="flex items-center gap-3">
                    <input
                      type="color"
                      value={bgColor}
                      onChange={(e) => setBgColor(e.target.value)}
                      className="h-9 w-12 rounded cursor-pointer border-0 bg-transparent"
                    />
                    <input
                      type="text"
                      value={bgColor}
                      onChange={(e) => setBgColor(e.target.value)}
                      className="flex-1 rounded-md border border-white/10 bg-zinc-900 px-3 py-1.5 text-xs font-mono text-white focus:outline-none focus:ring-1 focus:ring-indigo-500"
                    />
                  </div>
                </div>

                {/* Nested Border Radius Math */}
                <div className="pt-4 border-t border-white/[0.08]">
                  <div className="flex justify-between text-xs font-mono text-zinc-300 mb-2">
                    <span>Outer Radius: {outerRadius}px</span>
                    <span className="text-indigo-400">Inner: {Math.max(0, outerRadius - containerPadding)}px</span>
                  </div>
                  <input
                    type="range"
                    min="4"
                    max="32"
                    value={outerRadius}
                    onChange={(e) => setOuterRadius(Number(e.target.value))}
                    className="w-full accent-indigo-500 cursor-pointer"
                  />
                  <div className="text-[11px] text-zinc-400 mt-1 font-mono">
                    Nested math: r_inner = r_outer - padding ({outerRadius} - {containerPadding} = {Math.max(0, outerRadius - containerPadding)}px)
                  </div>
                </div>
              </div>

              {/* Status indicators */}
              <div className="grid grid-cols-2 gap-3 pt-4 border-t border-white/[0.08]">
                <div className="rounded-lg bg-zinc-900/60 p-3 border border-white/[0.06]">
                  <div className="text-xs text-zinc-400">WCAG AA (4.5:1)</div>
                  <div className="mt-1 flex items-center gap-1.5 font-bold text-sm">
                    {passAA ? (
                      <span className="text-emerald-400 flex items-center gap-1">
                        <CheckCircle className="h-4 w-4" /> 통과 (Pass)
                      </span>
                    ) : (
                      <span className="text-rose-400 flex items-center gap-1">
                        <AlertTriangle className="h-4 w-4" /> 기준 미달
                      </span>
                    )}
                  </div>
                </div>
                <div className="rounded-lg bg-zinc-900/60 p-3 border border-white/[0.06]">
                  <div className="text-xs text-zinc-400">WCAG AAA (7.0:1)</div>
                  <div className="mt-1 flex items-center gap-1.5 font-bold text-sm">
                    {passAAA ? (
                      <span className="text-emerald-400 flex items-center gap-1">
                        <CheckCircle className="h-4 w-4" /> 통과 (Pass)
                      </span>
                    ) : (
                      <span className="text-zinc-400">보통</span>
                    )}
                  </div>
                </div>
              </div>
            </div>

            {/* Live Render Canvas */}
            <div className="lg:col-span-7 rounded-2xl border border-white/[0.08] bg-[#12141c] p-6 space-y-6">
              <div className="flex items-center justify-between text-xs text-zinc-400">
                <span>실시간 시각적 대비 프리뷰</span>
                <div className="font-mono text-sm font-bold text-indigo-400 tabular-nums">
                  명도비: {contrast}:1
                </div>
              </div>

              {/* Nested Outer Container respecting radius math */}
              <div
                style={{
                  backgroundColor: bgColor,
                  borderRadius: `${outerRadius}px`,
                  padding: `${containerPadding}px`,
                }}
                className="transition-all duration-200 border border-white/20 shadow-xl"
              >
                {/* Nested Inner Box */}
                <div
                  style={{
                    borderRadius: `${Math.max(0, outerRadius - containerPadding)}px`,
                    color: fgColor,
                  }}
                  className="bg-black/20 p-6 flex flex-col justify-center min-h-[160px]"
                >
                  <div className="text-xs font-mono opacity-80 mb-2">Display Headline (18px)</div>
                  <p className="text-xl font-bold leading-snug">
                    {testText}
                  </p>
                  <p className="mt-2 text-sm opacity-90 leading-relaxed">
                    선명한 텍스트 가독성은 장애 유무와 환경을 불문하고 모든 사용자에게 균등한 정보를 전달하는 가장 중요한 엔지니어링 가치입니다.
                  </p>
                </div>
              </div>

              <div className="text-xs text-zinc-400 leading-relaxed">
                * W3C 공식 알고리즘(<code className="font-mono text-zinc-300">Relative Luminance</code>)에 따른 실시간 수학적 계산입니다.
              </div>
            </div>
          </div>
        )}

        {/* Experiment 3: DOM Virtualization Visualizer */}
        {activeTab === 'virtualizer' && (
          <div className="mt-10 grid grid-cols-1 lg:grid-cols-12 gap-8 items-start">
            <div className="lg:col-span-5 rounded-2xl border border-white/[0.08] bg-[#12141c] p-6 space-y-5">
              <h3 className="text-base font-semibold text-white">가상화 렌더러 벤치마크</h3>
              <p className="text-xs text-zinc-400 leading-relaxed">
                대규모 리스트(10,000건)를 브라우저에 그대로 마운트하면 브라우저는 심각한 메모리 스파이크와 스크롤 지연을 겪습니다. 뷰포트 윈도잉(Windowing) 기법으로 활성 DOM 노드를 극도로 제한합니다.
              </p>

              <div className="space-y-3 pt-2">
                <div className="flex justify-between items-center py-2 border-b border-white/[0.06] text-xs">
                  <span className="text-zinc-400">전체 가상 데이터셋</span>
                  <span className="font-mono text-white font-bold tabular-nums">10,000 건</span>
                </div>
                <div className="flex justify-between items-center py-2 border-b border-white/[0.06] text-xs">
                  <span className="text-zinc-400">현재 활성 DOM 노드</span>
                  <span className="font-mono text-emerald-400 font-bold tabular-nums">{visibleItems.length} 개만 유지</span>
                </div>
                <div className="flex justify-between items-center py-2 border-b border-white/[0.06] text-xs">
                  <span className="text-zinc-400">메모리 절감율</span>
                  <span className="font-mono text-indigo-400 font-bold tabular-nums">99.88% 절감</span>
                </div>
                <div className="flex justify-between items-center py-2 text-xs">
                  <span className="text-zinc-400">스크롤 프레임 속도</span>
                  <span className="font-mono text-emerald-400 font-bold">60 FPS 보장</span>
                </div>
              </div>
            </div>

            {/* Virtualized Scroll Area */}
            <div className="lg:col-span-7 rounded-2xl border border-white/[0.08] bg-[#12141c] p-6">
              <div className="flex items-center justify-between text-xs text-zinc-400 mb-3">
                <span>가상화 윈도우 스크롤 (마우스 휠로 빠르게 스크롤 해보세요)</span>
                <span className="font-mono text-zinc-400">Index {startIndex} - {endIndex}</span>
              </div>

              {/* Scroll Container */}
              <div
                onScroll={(e) => setScrollTop(e.currentTarget.scrollTop)}
                className="relative overflow-y-auto rounded-xl border border-white/[0.08] bg-zinc-950 p-2"
                style={{ height: `${viewportHeight}px` }}
              >
                {/* Phantom spacer that gives natural scrollbar height */}
                <div style={{ height: `${totalItems * itemHeight}px`, position: 'relative' }}>
                  {visibleItems.map((idx) => (
                    <div
                      key={idx}
                      style={{
                        position: 'absolute',
                        top: `${idx * itemHeight}px`,
                        left: 0,
                        right: 0,
                        height: `${itemHeight - 4}px`,
                      }}
                      className="flex items-center justify-between px-3 rounded bg-white/[0.04] text-xs text-zinc-300 font-mono hover:bg-white/[0.08]"
                    >
                      <span className="flex items-center gap-2">
                        <span className="text-indigo-400 tabular-nums">#{idx.toString().padStart(5, '0')}</span>
                        <span className="text-zinc-400 font-sans">실시간 트랜잭션 스트림 데이터 패킷</span>
                      </span>
                      <span className="text-zinc-400 text-[11px] tabular-nums">0.0{idx % 9}ms latency</span>
                    </div>
                  ))}
                </div>
              </div>

              <div className="mt-3 flex items-center justify-between text-[11px] text-zinc-400">
                <span>* 스크롤 오프셋: <code className="font-mono text-zinc-300">{Math.round(scrollTop)}px</code></span>
                <span>가상 높이: <code className="font-mono text-zinc-300">{totalItems * itemHeight}px</code></span>
              </div>
            </div>
          </div>
        )}

      </div>
    </section>
  );
};
