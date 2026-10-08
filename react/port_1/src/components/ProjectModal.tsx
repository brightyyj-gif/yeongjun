import React, { useEffect } from 'react';
import { X, ExternalLink, Github, CheckCircle2, Layers, Cpu, TrendingUp } from 'lucide-react';
import { Project } from '../types/portfolio';

interface ProjectModalProps {
  project: Project | null;
  onClose: () => void;
}

export const ProjectModal: React.FC<ProjectModalProps> = ({ project, onClose }) => {
  useEffect(() => {
    const handleKeyDown = (e: KeyboardEvent) => {
      if (e.key === 'Escape') onClose();
    };
    if (project) {
      document.body.style.overflow = 'hidden';
      window.addEventListener('keydown', handleKeyDown);
    }
    return () => {
      document.body.style.overflow = '';
      window.removeEventListener('keydown', handleKeyDown);
    };
  }, [project, onClose]);

  if (!project) return null;

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
        {/* Top bar with unboxed category kicker and close button */}
        <div className="flex items-center justify-between border-b border-white/[0.08] pb-4">
          <div className="flex items-center gap-2 text-xs font-mono text-zinc-400">
            <span>{project.categoryLabel}</span>
            <span aria-hidden="true">·</span>
            <span>{project.period}</span>
            <span aria-hidden="true">·</span>
            <span>{project.role}</span>
          </div>
          <button
            onClick={onClose}
            className="rounded-lg p-2 text-zinc-400 hover:bg-white/[0.06] hover:text-white transition-colors focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-indigo-400"
            aria-label="닫기 (ESC)"
          >
            <X className="h-5 w-5" />
          </button>
        </div>

        {/* Project Header */}
        <div className="mt-6">
          <h2 className="text-2xl sm:text-3xl font-extrabold text-white tracking-tight">
            {project.title}
          </h2>
          <p className="mt-2 text-sm sm:text-base text-zinc-300">
            {project.subtitle}
          </p>
        </div>

        {/* Media Frame */}
        <div className="mt-6 overflow-hidden rounded-xl border border-white/[0.08] bg-black">
          <img
            src={project.image}
            alt={project.title}
            referrerPolicy="no-referrer"
            className="w-full max-h-[380px] object-cover object-top"
            onError={(e) => {
              e.currentTarget.style.display = 'none';
            }}
          />
        </div>

        {/* Impact Metrics Row */}
        <div className="mt-6 grid grid-cols-2 gap-3 sm:grid-cols-4 rounded-xl border border-white/[0.08] bg-white/[0.02] p-4">
          {project.impactMetrics.map((metric, idx) => (
            <div key={idx}>
              <div className="text-xl sm:text-2xl font-bold font-mono text-indigo-400 tabular-nums">
                {metric.value}
              </div>
              <div className="mt-0.5 text-xs text-zinc-400">
                {metric.label}
              </div>
            </div>
          ))}
        </div>

        {/* Challenge & Solution Grid */}
        <div className="mt-8 grid grid-cols-1 gap-6 sm:grid-cols-2">
          <div className="rounded-xl border border-white/[0.08] bg-zinc-900/40 p-5">
            <div className="flex items-center gap-2 text-xs font-semibold uppercase tracking-wider text-amber-400">
              <Cpu className="h-4 w-4" />
              <span>핵심 문제 & 과제 (The Challenge)</span>
            </div>
            <p className="mt-3 text-sm leading-relaxed text-zinc-300">
              {project.challenge}
            </p>
          </div>

          <div className="rounded-xl border border-white/[0.08] bg-zinc-900/40 p-5">
            <div className="flex items-center gap-2 text-xs font-semibold uppercase tracking-wider text-emerald-400">
              <TrendingUp className="h-4 w-4" />
              <span>엔지니어링 솔루션 (Engineering Solution)</span>
            </div>
            <p className="mt-3 text-sm leading-relaxed text-zinc-300">
              {project.solution}
            </p>
          </div>
        </div>

        {/* Key Features List */}
        <div className="mt-8">
          <h3 className="text-sm font-semibold uppercase tracking-wider text-zinc-400">
            주요 엔지니어링 구현 내역
          </h3>
          <ul className="mt-3 space-y-2.5">
            {project.features.map((feat, idx) => (
              <li key={idx} className="flex items-start gap-2.5 text-sm text-zinc-300 leading-normal">
                <CheckCircle2 className="h-4 w-4 shrink-0 text-indigo-400 mt-0.5" />
                <span>{feat}</span>
              </li>
            ))}
          </ul>
        </div>

        {/* Architecture Snippet (if available) */}
        {project.architectureSnippet && (
          <div className="mt-8">
            <div className="flex items-center justify-between mb-2">
              <span className="text-xs font-mono uppercase text-zinc-400 flex items-center gap-1.5">
                <Layers className="h-3.5 w-3.5 text-indigo-400" />
                <span>Core Implementation Snippet</span>
              </span>
            </div>
            <pre className="overflow-x-auto rounded-xl border border-white/[0.08] bg-zinc-950 p-4 font-mono text-xs leading-5 text-zinc-300">
              <code>{project.architectureSnippet}</code>
            </pre>
          </div>
        )}

        {/* Tech Stack - Zero Pill Discipline: clean text with typographic separators */}
        <div className="mt-8 border-t border-white/[0.08] pt-4">
          <span className="text-xs font-semibold uppercase tracking-wider text-zinc-400">
            기술 스택:
          </span>
          <div className="mt-2 flex flex-wrap items-center gap-x-2 gap-y-1 text-sm font-medium text-zinc-300">
            {project.techStack.map((tech, idx) => (
              <React.Fragment key={tech}>
                <span>{tech}</span>
                {idx < project.techStack.length - 1 && (
                  <span aria-hidden="true" className="text-zinc-600">·</span>
                )}
              </React.Fragment>
            ))}
          </div>
        </div>

        {/* Footer actions */}
        <div className="mt-8 flex items-center justify-end gap-3 border-t border-white/[0.08] pt-4">
          <button
            onClick={onClose}
            className="rounded-lg px-4 py-2 text-xs font-medium text-zinc-300 hover:bg-white/[0.06] transition-colors"
          >
            닫기
          </button>
        </div>

      </div>
    </div>
  );
};
