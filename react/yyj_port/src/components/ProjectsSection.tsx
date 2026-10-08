import React, { useState } from 'react';
import { ArrowUpRight, Sparkles } from 'lucide-react';
import { Project } from '../types/portfolio';
import { PROJECTS } from '../data/portfolioData';
import { ProjectModal } from './ProjectModal';

export const ProjectsSection: React.FC = () => {
  const [activeCategory, setActiveCategory] = useState<string>('all');
  const [selectedProject, setSelectedProject] = useState<Project | null>(null);

  const filterTabs = [
    { id: 'all', label: 'All Projects' },
    { id: 'design-system', label: 'Design System & Infra' },
    { id: 'web-app', label: 'High-Perf Web Apps' },
    { id: 'data-viz', label: 'Data Visualization' },
    { id: 'canvas', label: 'Interactive Canvas' },
  ];

  const filteredProjects = activeCategory === 'all'
    ? PROJECTS
    : PROJECTS.filter((p) => p.category === activeCategory);

  return (
    <section id="works" className="py-20 md:py-28 border-b border-white/[0.06]">
      <div className="mx-auto max-w-7xl px-4 sm:px-6 lg:px-8">
        
        {/* Section Header */}
        <div className="flex flex-col md:flex-row md:items-end md:justify-between gap-6 pb-10 border-b border-white/[0.08]">
          <div>
            <div className="text-xs font-mono uppercase tracking-widest text-indigo-400">
              01. Featured Works & Case Studies
            </div>
            <h2 className="mt-2 text-2xl sm:text-4xl font-extrabold text-white tracking-tight">
              실제 프로덕션 문제를 해결한 엔지니어링 프로젝트
            </h2>
            <p className="mt-2 text-sm sm:text-base text-zinc-400 max-w-2xl">
              단순 UI 개발을 넘어, 프레임 최적화, 컴포넌트 아키텍처, 상태 분리 및 접근성을 직접 입증한 대표 프로젝트들입니다.
            </p>
          </div>

          {/* Interactive filter segmented buttons (Functional buttons allowed) */}
          <div className="flex flex-wrap items-center gap-1.5 p-1 bg-white/[0.04] rounded-lg border border-white/[0.08] self-start md:self-end">
            {filterTabs.map((tab) => (
              <button
                key={tab.id}
                onClick={() => setActiveCategory(tab.id)}
                className={`px-3 py-1.5 text-xs font-medium rounded-md transition-all whitespace-nowrap focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-indigo-400 ${
                  activeCategory === tab.id
                    ? 'bg-indigo-600 text-white shadow-sm'
                    : 'text-zinc-400 hover:text-white hover:bg-white/[0.04]'
                }`}
              >
                {tab.label}
              </button>
            ))}
          </div>
        </div>

        {/* Bento Grid Layout */}
        <div className="mt-12 grid grid-cols-1 md:grid-cols-2 lg:grid-cols-12 gap-8">
          {filteredProjects.map((project, index) => {
            // Give top 2 projects larger visual bento span
            const isLarge = index === 0 || index === 1;
            const colSpanClass = isLarge ? 'lg:col-span-6' : 'lg:col-span-6';

            return (
              <div
                key={project.id}
                onClick={() => setSelectedProject(project)}
                className={`group relative flex flex-col justify-between overflow-hidden rounded-2xl border border-white/[0.08] bg-[#12141d] p-6 sm:p-7 transition-all duration-300 hover:border-indigo-500/40 hover:bg-[#151722] cursor-pointer shadow-lg ${colSpanClass}`}
              >
                <div>
                  {/* Clean unboxed metadata header */}
                  <div className="flex items-center justify-between text-xs text-zinc-400 mb-3">
                    <div className="flex items-center gap-2">
                      <span className="font-medium text-indigo-400">{project.categoryLabel}</span>
                      <span aria-hidden="true" className="text-zinc-600">·</span>
                      <span className="font-mono tabular-nums">{project.year}</span>
                    </div>
                    <span className="text-zinc-400 flex items-center gap-1 group-hover:text-white transition-colors">
                      <span className="text-xs">상세 분석</span>
                      <ArrowUpRight className="h-3.5 w-3.5 transition-transform group-hover:translate-x-0.5 group-hover:-translate-y-0.5" />
                    </span>
                  </div>

                  {/* Title and subtitle */}
                  <h3 className="text-xl font-bold text-white group-hover:text-indigo-200 transition-colors">
                    {project.title}
                  </h3>
                  <p className="mt-1 text-sm text-zinc-300">
                    {project.subtitle}
                  </p>

                  {/* Media Frame */}
                  <div className="mt-5 aspect-[16/9] w-full overflow-hidden rounded-xl border border-white/[0.06] bg-black">
                    <img
                      src={project.image}
                      alt={project.title}
                      referrerPolicy="no-referrer"
                      className="h-full w-full object-cover transition-transform duration-500 group-hover:scale-105"
                      onError={(e) => {
                        e.currentTarget.style.display = 'none';
                      }}
                    />
                  </div>

                  {/* Summary prose */}
                  <p className="mt-5 text-sm text-zinc-400 leading-relaxed line-clamp-2">
                    {project.summary}
                  </p>
                </div>

                {/* Bottom Stats & Tech */}
                <div className="mt-6 pt-5 border-t border-white/[0.06]">
                  {/* Impact metrics row */}
                  <div className="grid grid-cols-2 gap-3 mb-4">
                    {project.impactMetrics.slice(0, 2).map((metric, i) => (
                      <div key={i}>
                        <div className="text-base font-bold font-mono text-white tabular-nums">
                          {metric.value}
                        </div>
                        <div className="text-xs text-zinc-400 truncate">
                          {metric.label}
                        </div>
                      </div>
                    ))}
                  </div>

                  {/* Tech stack: Clean unboxed text with typographic separators */}
                  <div className="flex flex-wrap items-center gap-x-2 gap-y-1 text-xs text-zinc-400">
                    {project.techStack.slice(0, 4).map((tech, idx) => (
                      <React.Fragment key={tech}>
                        <span>{tech}</span>
                        {idx < Math.min(project.techStack.length, 4) - 1 && (
                          <span aria-hidden="true" className="text-zinc-600">·</span>
                        )}
                      </React.Fragment>
                    ))}
                  </div>
                </div>

              </div>
            );
          })}
        </div>

      </div>

      {/* Full Detail Modal */}
      <ProjectModal
        project={selectedProject}
        onClose={() => setSelectedProject(null)}
      />
    </section>
  );
};
