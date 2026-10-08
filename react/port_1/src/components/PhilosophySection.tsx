import React from 'react';
import { PHILOSOPHY_PILLARS } from '../data/portfolioData';
import { ShieldCheck, Gauge, Network, Terminal } from 'lucide-react';

export const PhilosophySection: React.FC = () => {
  const pillarIcons = [Gauge, ShieldCheck, Network, Terminal];

  return (
    <section id="philosophy" className="py-20 md:py-28 border-b border-white/[0.06]">
      <div className="mx-auto max-w-7xl px-4 sm:px-6 lg:px-8">
        
        {/* Section Header */}
        <div className="pb-10 border-b border-white/[0.08]">
          <div className="text-xs font-mono uppercase tracking-widest text-indigo-400">
            03. Engineering Philosophy & Principles
          </div>
          <h2 className="mt-2 text-2xl sm:text-4xl font-extrabold text-white tracking-tight">
            지속 가능한 웹을 구축하기 위한 4가지 엔지니어링 신념
          </h2>
          <p className="mt-2 text-sm sm:text-base text-zinc-400 max-w-2xl">
            단순히 동작하는 코드를 넘어, 사용자에게는 즉각적인 피드백을, 동료 개발자에게는 예측 가능한 유지보수성을 선사하는 아키텍처 원칙입니다.
          </p>
        </div>

        {/* 4 Pillars Grid */}
        <div className="mt-12 grid grid-cols-1 md:grid-cols-2 gap-8">
          {PHILOSOPHY_PILLARS.map((pillar, index) => {
            const Icon = pillarIcons[index % pillarIcons.length];
            return (
              <div
                key={pillar.number}
                className="rounded-2xl border border-white/[0.08] bg-[#12141d] p-7 transition-all duration-300 hover:border-white/20 hover:bg-[#151722]"
              >
                <div className="flex items-center justify-between text-xs text-zinc-400 mb-4">
                  <div className="flex items-center gap-2">
                    <span className="font-mono text-base font-bold text-indigo-400">{pillar.number}</span>
                    <span aria-hidden="true" className="text-zinc-600">·</span>
                    <span className="text-zinc-400 uppercase tracking-wider">{pillar.subtitle}</span>
                  </div>
                  <Icon className="h-5 w-5 text-zinc-400" />
                </div>

                <h3 className="text-xl font-bold text-white tracking-tight">
                  {pillar.title}
                </h3>

                <p className="mt-3 text-sm text-zinc-300 leading-relaxed">
                  {pillar.description}
                </p>
              </div>
            );
          })}
        </div>

        {/* Core Web Vitals Covenant Bar */}
        <div className="mt-12 rounded-2xl border border-white/[0.08] bg-white/[0.02] p-6 sm:p-8">
          <div className="flex flex-col md:flex-row md:items-center justify-between gap-6">
            <div>
              <h4 className="text-base font-bold text-white">
                Core Web Vitals 프로덕션 기준선 (Performance Threshold)
              </h4>
              <p className="mt-1 text-xs text-zinc-400">
                모든 배포 파이프라인에서 측정되는 엄격한 프론트엔드 SLO 지표입니다.
              </p>
            </div>
            
            <div className="flex flex-wrap items-center gap-6 text-xs font-mono">
              <div>
                <span className="text-zinc-400">INP:</span>{' '}
                <span className="text-emerald-400 font-bold tabular-nums">&lt; 50ms</span>
              </div>
              <span aria-hidden="true" className="text-zinc-700">|</span>
              <div>
                <span className="text-zinc-400">LCP:</span>{' '}
                <span className="text-emerald-400 font-bold tabular-nums">&lt; 1.2s</span>
              </div>
              <span aria-hidden="true" className="text-zinc-700">|</span>
              <div>
                <span className="text-zinc-400">CLS:</span>{' '}
                <span className="text-emerald-400 font-bold tabular-nums">0.000</span>
              </div>
              <span aria-hidden="true" className="text-zinc-700">|</span>
              <div>
                <span className="text-zinc-400">Bundle Init:</span>{' '}
                <span className="text-emerald-400 font-bold tabular-nums">&lt; 150KB</span>
              </div>
            </div>
          </div>
        </div>

      </div>
    </section>
  );
};
