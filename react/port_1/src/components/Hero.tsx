import React, { useState } from 'react';
import { ArrowDown, Code2, Sparkles, Terminal, CheckCircle2, Copy } from 'lucide-react';
import { HERO_IMAGE } from '../data/portfolioData';

interface HeroProps {
  onOpenResume: () => void;
  onOpenContact: () => void;
}

export const Hero: React.FC<HeroProps> = ({ onOpenResume, onOpenContact }) => {
  const [activeSnippetTab, setActiveSnippetTab] = useState<'profiler' | 'architecture'>('profiler');
  const [copied, setCopied] = useState(false);

  const emailText = 'brightyyj@gmail.com';

  const handleCopyEmail = () => {
    navigator.clipboard.writeText(emailText);
    setCopied(true);
    setTimeout(() => setCopied(false), 2000);
  };

  return (
    <section className="relative overflow-hidden pt-12 pb-20 md:pt-20 md:pb-32 border-b border-white/[0.06]">
      {/* Subtle radial ambient glow in background (non-intrusive) */}
      <div
        className="pointer-events-none absolute -top-40 left-1/2 -z-10 h-[500px] w-[800px] -translate-x-1/2 opacity-25 blur-[120px]"
        style={{
          background: 'radial-gradient(circle, rgba(99,102,241,0.4) 0%, rgba(14,165,233,0.15) 50%, transparent 80%)'
        }}
        aria-hidden="true"
      />

      <div className="mx-auto max-w-7xl px-4 sm:px-6 lg:px-8">
        <div className="grid grid-cols-1 items-center gap-12 lg:grid-cols-12 lg:gap-16">
          
          {/* Left Column: Typographic Focus & Value Proposition */}
          <div className="lg:col-span-7">
            {/* Zero-pill metadata kicker */}
            <div className="flex flex-wrap items-center gap-2 text-xs font-medium text-zinc-400 mb-4 tracking-wide uppercase">
              <span>Frontend Architect</span>
              <span aria-hidden="true" className="text-zinc-600">·</span>
              <span>Based in Seoul</span>
              <span aria-hidden="true" className="text-zinc-600">·</span>
              <span className="text-emerald-400">Open for Opportunities</span>
            </div>

            {/* Main Headline with balanced wrap */}
            <h1 className="text-3xl font-extrabold tracking-tight text-white sm:text-5xl lg:text-5xl leading-[1.15]" style={{ textWrap: 'balance' }}>
              사용자 경험과 브라우저 렌더링 성능을 극대화하는 <span className="text-transparent bg-clip-text bg-gradient-to-r from-indigo-300 via-indigo-200 to-sky-300">프론트엔드 엔지니어</span> 김민준입니다.
            </h1>

            {/* Supporting Prose */}
            <p className="mt-5 text-base sm:text-lg text-zinc-300 leading-relaxed max-w-2xl">
              단순한 화면 구현을 넘어, 16ms 프레임 예산을 수호하고 예측 가능한 상태 아키텍처를 구축합니다.
              디자인 시스템, 대규모 실시간 캔버스 시각화, 그리고 마이크로 인터랙션을 설계하며 웹의 경계를 넓힙니다.
            </p>

            {/* Proof Metrics Grid - Strictly adjacent to claims */}
            <div className="mt-8 grid grid-cols-2 gap-4 border-t border-b border-white/[0.08] py-5 sm:grid-cols-4">
              <div>
                <div className="font-mono text-2xl sm:text-3xl font-bold tracking-tight text-white tabular-nums">99+</div>
                <div className="mt-1 text-xs text-zinc-400">Lighthouse Score</div>
              </div>
              <div>
                <div className="font-mono text-2xl sm:text-3xl font-bold tracking-tight text-white tabular-nums">&lt;45ms</div>
                <div className="mt-1 text-xs text-zinc-400">INP 지연 최적화</div>
              </div>
              <div>
                <div className="font-mono text-2xl sm:text-3xl font-bold tracking-tight text-white tabular-nums">-42%</div>
                <div className="mt-1 text-xs text-zinc-400">번들 크기 경량화</div>
              </div>
              <div>
                <div className="font-mono text-2xl sm:text-3xl font-bold tracking-tight text-white tabular-nums">5+ Yrs</div>
                <div className="mt-1 text-xs text-zinc-400">프로덕션 엔지니어링</div>
              </div>
            </div>

            {/* Action buttons */}
            <div className="mt-8 flex flex-wrap items-center gap-3">
              <a
                href="#works"
                className="inline-flex items-center gap-2 rounded-lg bg-indigo-600 px-5 py-2.5 text-sm font-semibold text-white shadow-sm transition-all hover:bg-indigo-500 active:scale-[0.98] focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-indigo-400 whitespace-nowrap"
              >
                <span>주요 프로젝트 살펴보기</span>
                <ArrowDown className="h-4 w-4" />
              </a>

              <button
                onClick={onOpenResume}
                className="inline-flex items-center gap-2 rounded-lg border border-white/10 bg-white/[0.04] px-4 py-2.5 text-sm font-medium text-zinc-200 transition-colors hover:bg-white/[0.08] hover:text-white focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-indigo-400 whitespace-nowrap"
              >
                <span>이력서 및 기술 스택</span>
              </button>

              <button
                onClick={handleCopyEmail}
                className="inline-flex items-center gap-1.5 rounded-lg border border-transparent px-3 py-2.5 text-xs text-zinc-400 transition-colors hover:text-zinc-200 focus-visible:outline-none whitespace-nowrap"
                title="이메일 복사"
              >
                {copied ? (
                  <>
                    <CheckCircle2 className="h-3.5 w-3.5 text-emerald-400" />
                    <span className="text-emerald-400">이메일 복사됨!</span>
                  </>
                ) : (
                  <>
                    <Copy className="h-3.5 w-3.5" />
                    <span>brightyyj@gmail.com</span>
                  </>
                )}
              </button>
            </div>
          </div>

          {/* Right Column: Architectural Photography & Live Code Inspection */}
          <div className="lg:col-span-5">
            <div className="relative overflow-hidden rounded-2xl border border-white/[0.1] bg-[#12141c] shadow-2xl">
              
              {/* Image Frame */}
              <div className="relative aspect-[16/10] w-full overflow-hidden bg-zinc-900">
                <img
                  src={HERO_IMAGE}
                  alt="프론트엔드 엔지니어 작업 공간 및 코드 에디터 환경"
                  referrerPolicy="no-referrer"
                  className="h-full w-full object-cover transition-transform duration-700 hover:scale-105"
                  onError={(e) => {
                    // Zero broken image fallback
                    e.currentTarget.style.display = 'none';
                  }}
                />
                <div className="pointer-events-none absolute inset-0 bg-gradient-to-t from-[#12141c] via-black/30 to-transparent" />
                
                {/* Floating subtle overlay */}
                <div className="absolute bottom-3 left-4 right-4 flex items-center justify-between text-xs text-zinc-300">
                  <span className="font-mono text-zinc-300">Engineered with Precision</span>
                  <span className="text-zinc-400 font-mono">Seoul, KR</span>
                </div>
              </div>

              {/* Interactive Code/Profiler Card */}
              <div className="p-4 bg-[#10121a]">
                <div className="flex items-center justify-between border-b border-white/[0.08] pb-3">
                  <div className="flex items-center gap-1 bg-zinc-900 p-0.5 rounded-md border border-white/[0.06]">
                    <button
                      onClick={() => setActiveSnippetTab('profiler')}
                      className={`px-2.5 py-1 text-xs font-medium rounded transition-colors whitespace-nowrap ${
                        activeSnippetTab === 'profiler'
                          ? 'bg-zinc-800 text-white shadow-sm'
                          : 'text-zinc-400 hover:text-zinc-200'
                      }`}
                    >
                      Rendering Budget
                    </button>
                    <button
                      onClick={() => setActiveSnippetTab('architecture')}
                      className={`px-2.5 py-1 text-xs font-medium rounded transition-colors whitespace-nowrap ${
                        activeSnippetTab === 'architecture'
                          ? 'bg-zinc-800 text-white shadow-sm'
                          : 'text-zinc-400 hover:text-zinc-200'
                      }`}
                    >
                      Web Vital Contract
                    </button>
                  </div>
                  <div className="flex items-center gap-1.5 text-xs text-emerald-400 font-mono">
                    <span className="h-1.5 w-1.5 rounded-full bg-emerald-400 animate-pulse" />
                    <span>60 FPS Target</span>
                  </div>
                </div>

                <div className="mt-3">
                  {activeSnippetTab === 'profiler' ? (
                    <div className="space-y-2 font-mono text-xs text-zinc-300">
                      <div className="flex justify-between items-center py-1 border-b border-white/[0.04]">
                        <span className="text-zinc-400">Interaction (INP)</span>
                        <span className="text-emerald-400 font-semibold tabular-nums">28ms (Ideal &lt; 200ms)</span>
                      </div>
                      <div className="flex justify-between items-center py-1 border-b border-white/[0.04]">
                        <span className="text-zinc-400">Largest Contentful Paint</span>
                        <span className="text-emerald-400 font-semibold tabular-nums">0.9s (Ideal &lt; 2.5s)</span>
                      </div>
                      <div className="flex justify-between items-center py-1 border-b border-white/[0.04]">
                        <span className="text-zinc-400">Cumulative Layout Shift</span>
                        <span className="text-emerald-400 font-semibold tabular-nums">0.002 (Ideal &lt; 0.1)</span>
                      </div>
                      <div className="flex justify-between items-center py-1">
                        <span className="text-zinc-400">GC Heap Overhead</span>
                        <span className="text-zinc-300 tabular-nums">14.2 MB / 0 Leak</span>
                      </div>
                    </div>
                  ) : (
                    <pre className="overflow-x-auto text-[11px] leading-5 font-mono text-zinc-300 bg-zinc-950/70 p-3 rounded-lg border border-white/[0.06]">
                      <code>{`// Core Engineering Covenant
interface FrontendSLO {
  maxBundleSize: "180kb"; // Gzipped init
  frameDropAllowance: 0;   // 60fps gesture
  contrastRatio: ">= 4.5:1"; // WCAG AA
  layoutThrashing: "Prohibited";
}`}</code>
                    </pre>
                  )}
                </div>
              </div>
            </div>
          </div>

        </div>
      </div>
    </section>
  );
};
