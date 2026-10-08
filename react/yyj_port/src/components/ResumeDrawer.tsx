import React, { useEffect, useState } from 'react';
import { X, Download, Printer, Check, Copy, ExternalLink, Award, BookOpen } from 'lucide-react';
import { SKILL_CATEGORIES } from '../data/portfolioData';

interface ResumeDrawerProps {
  isOpen: boolean;
  onClose: () => void;
}

export const ResumeDrawer: React.FC<ResumeDrawerProps> = ({ isOpen, onClose }) => {
  const [copiedResume, setCopiedResume] = useState(false);

  useEffect(() => {
    const handleKeyDown = (e: KeyboardEvent) => {
      if (e.key === 'Escape') onClose();
    };
    if (isOpen) {
      document.body.style.overflow = 'hidden';
      window.addEventListener('keydown', handleKeyDown);
    }
    return () => {
      document.body.style.overflow = '';
      window.removeEventListener('keydown', handleKeyDown);
    };
  }, [isOpen, onClose]);

  if (!isOpen) return null;

  const handlePrint = () => {
    window.print();
  };

  const handleCopyMarkdown = () => {
    const markdown = `# 양영준 (Yeongjun Yang) — Senior Frontend Engineer
- 이메일: brightyyj@gmail.com
- 지역: 대한민국 서울
- 전문 분야: React 19, Next.js, Web Performance, Design Systems, Canvas/WebGL

## 주요 역량 요약
- Core Web Vitals 최적화 (INP < 45ms 달성)
- 디자인 시스템 구축 및 Style-Dictionary 기반 멀티 플랫폼 토큰 컴파일러 개발
- Web Worker 및 OffscreenCanvas 기반 대규모 실시간 데이터 시각화
`;
    navigator.clipboard.writeText(markdown);
    setCopiedResume(true);
    setTimeout(() => setCopiedResume(false), 2000);
  };

  return (
    <div
      role="dialog"
      aria-modal="true"
      className="fixed inset-0 z-50 flex items-center justify-center p-4 sm:p-6 lg:p-8 bg-black/80 backdrop-blur-sm animate-in fade-in duration-200"
    >
      <div
        className="relative max-h-[90vh] w-full max-w-4xl overflow-y-auto rounded-2xl border border-white/10 bg-[#11131a] p-6 sm:p-8 shadow-2xl text-zinc-100"
        onClick={(e) => e.stopPropagation()}
      >
        {/* Header bar */}
        <div className="flex items-center justify-between border-b border-white/[0.08] pb-4">
          <div className="flex items-center gap-3">
            <h2 className="text-xl font-bold text-white">
              이력서 & 기술 역량 매트릭스 (Resume)
            </h2>
          </div>
          
          <div className="flex items-center gap-2">
            <button
              onClick={handleCopyMarkdown}
              className="inline-flex items-center gap-1.5 rounded-lg border border-white/10 bg-white/[0.04] px-3 py-1.5 text-xs font-medium text-zinc-300 hover:bg-white/[0.08] transition-colors"
            >
              {copiedResume ? (
                <>
                  <Check className="h-3.5 w-3.5 text-emerald-400" />
                  <span className="text-emerald-400">복사 완료</span>
                </>
              ) : (
                <>
                  <Copy className="h-3.5 w-3.5" />
                  <span>요약 복사</span>
                </>
              )}
            </button>
            <button
              onClick={handlePrint}
              className="inline-flex items-center gap-1.5 rounded-lg border border-white/10 bg-white/[0.04] px-3 py-1.5 text-xs font-medium text-zinc-300 hover:bg-white/[0.08] transition-colors"
            >
              <Printer className="h-3.5 w-3.5" />
              <span>인쇄</span>
            </button>
            <button
              onClick={onClose}
              className="rounded-lg p-1.5 text-zinc-400 hover:bg-white/[0.06] hover:text-white transition-colors"
              aria-label="닫기"
            >
              <X className="h-5 w-5" />
            </button>
          </div>
        </div>

        {/* Profile Info Banner */}
        <div className="mt-6 border-b border-white/[0.08] pb-6">
          <div className="text-2xl font-extrabold text-white">양영준 (Yeongjun Yang)</div>
          <div className="mt-1 text-sm text-indigo-400 font-medium">
            Senior Frontend Engineer & UI Architect · 5+ Years Experience
          </div>
          <div className="mt-3 flex flex-wrap items-center gap-x-4 gap-y-1 text-xs text-zinc-400 font-mono">
            <span>brightyyj@gmail.com</span>
            <span aria-hidden="true" className="text-zinc-600">·</span>
            <span>Seoul, Republic of Korea</span>
            <span aria-hidden="true" className="text-zinc-600">·</span>
            <span>github.com/brightyyj</span>
          </div>
        </div>

        {/* Skills Matrix Grid */}
        <div className="mt-6">
          <h3 className="text-sm font-semibold uppercase tracking-wider text-zinc-400 mb-4">
            전문 기술 역량 분류 (Technical Competencies)
          </h3>
          
          <div className="grid grid-cols-1 md:grid-cols-2 gap-6">
            {SKILL_CATEGORIES.map((category) => (
              <div
                key={category.title}
                className="rounded-xl border border-white/[0.08] bg-zinc-950/60 p-5"
              >
                <div className="text-xs font-mono font-semibold text-indigo-400 mb-3 uppercase tracking-wider">
                  {category.title}
                </div>
                <div className="space-y-3">
                  {category.items.map((skill) => (
                    <div key={skill.name} className="border-b border-white/[0.04] pb-2.5 last:border-b-0 last:pb-0">
                      <div className="flex items-center justify-between text-xs">
                        <span className="font-semibold text-white">{skill.name}</span>
                        <span className="text-[11px] font-mono text-zinc-400">{skill.level}</span>
                      </div>
                      <p className="mt-1 text-[11px] text-zinc-400 leading-relaxed">
                        {skill.description}
                      </p>
                    </div>
                  ))}
                </div>
              </div>
            ))}
          </div>
        </div>

        {/* Education & Awards */}
        <div className="mt-8 grid grid-cols-1 md:grid-cols-2 gap-6 border-t border-white/[0.08] pt-6">
          <div>
            <div className="flex items-center gap-2 text-xs font-semibold uppercase tracking-wider text-zinc-400 mb-3">
              <BookOpen className="h-4 w-4 text-indigo-400" />
              <span>학력 (Education)</span>
            </div>
            <div className="rounded-xl border border-white/[0.06] bg-zinc-950/40 p-4">
              <div className="text-sm font-bold text-white">컴퓨터공학과 학사 졸업</div>
              <div className="text-xs text-zinc-400 mt-0.5">2016.03 — 2020.02 (서울 소재 4년제 대학교)</div>
              <p className="text-xs text-zinc-400 mt-2">
                자료구조, 알고리즘, 컴퓨터 그래픽스, 운영체제 이수
              </p>
            </div>
          </div>

          <div>
            <div className="flex items-center gap-2 text-xs font-semibold uppercase tracking-wider text-zinc-400 mb-3">
              <Award className="h-4 w-4 text-amber-400" />
              <span>수상 및 외부 활동</span>
            </div>
            <div className="rounded-xl border border-white/[0.06] bg-zinc-950/40 p-4 space-y-2 text-xs text-zinc-300">
              <div>
                <span className="font-semibold text-white">2020 Awwwards Site of the Day</span>
                <span className="text-zinc-400 block text-[11px]">인터랙티브 3D 웹 쇼룸 개발 기여</span>
              </div>
              <div>
                <span className="font-semibold text-white">FEConf / 테크 블로그 연사 및 기고</span>
                <span className="text-zinc-400 block text-[11px]">"Core Web Vitals INP 개선 실전 가이드" 발표</span>
              </div>
            </div>
          </div>
        </div>

        {/* Close footer */}
        <div className="mt-8 flex justify-end border-t border-white/[0.08] pt-4">
          <button
            onClick={onClose}
            className="rounded-lg bg-indigo-600 px-4 py-2 text-xs font-semibold text-white hover:bg-indigo-500 transition-colors"
          >
            확인 및 닫기
          </button>
        </div>
      </div>
    </div>
  );
};
