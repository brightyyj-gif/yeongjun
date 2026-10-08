import React from 'react';
import { EXPERIENCES } from '../data/portfolioData';
import { Briefcase, MapPin, Calendar, CheckCircle2 } from 'lucide-react';

export const ExperienceSection: React.FC = () => {
  return (
    <section id="experience" className="py-20 md:py-28 border-b border-white/[0.06]">
      <div className="mx-auto max-w-7xl px-4 sm:px-6 lg:px-8">
        
        {/* Section Header */}
        <div className="pb-10 border-b border-white/[0.08]">
          <div className="text-xs font-mono uppercase tracking-widest text-indigo-400">
            04. Work Experience & Career
          </div>
          <h2 className="mt-2 text-2xl sm:text-4xl font-extrabold text-white tracking-tight">
            실제 팀과 함께 성장을 일궈낸 프로덕션 경험
          </h2>
          <p className="mt-2 text-sm sm:text-base text-zinc-400 max-w-2xl">
            빠르게 변화하는 스타트업부터 대규모 트래픽을 처리하는 핀테크 테크유니콘까지, 프론트엔드 플랫폼의 주춧돌을 놓아온 여정입니다.
          </p>
        </div>

        {/* Experience Timeline */}
        <div className="mt-12 space-y-12">
          {EXPERIENCES.map((exp, index) => (
            <div
              key={exp.id}
              className="relative rounded-2xl border border-white/[0.08] bg-[#12141d] p-6 sm:p-8 transition-all hover:border-white/20"
            >
              {/* Header row with unboxed metadata */}
              <div className="flex flex-col md:flex-row md:items-center md:justify-between gap-3 border-b border-white/[0.06] pb-4">
                <div>
                  <h3 className="text-xl font-bold text-white">
                    {exp.role}
                  </h3>
                  <div className="mt-1 text-base font-medium text-indigo-400">
                    {exp.company}
                  </div>
                </div>

                {/* Clean unboxed metadata with separators */}
                <div className="flex flex-wrap items-center gap-2 text-xs font-mono text-zinc-400">
                  <span className="flex items-center gap-1">
                    <Calendar className="h-3.5 w-3.5 text-zinc-400" />
                    <span>{exp.period}</span>
                  </span>
                  <span aria-hidden="true" className="text-zinc-600">·</span>
                  <span className="flex items-center gap-1">
                    <MapPin className="h-3.5 w-3.5 text-zinc-400" />
                    <span>{exp.location}</span>
                  </span>
                </div>
              </div>

              {/* Description */}
              <p className="mt-4 text-sm text-zinc-300 leading-relaxed">
                {exp.description}
              </p>

              {/* Achievements list */}
              <div className="mt-5 space-y-2.5">
                <div className="text-xs font-semibold uppercase tracking-wider text-zinc-400">
                  주요 성과 및 문제 해결
                </div>
                {exp.achievements.map((ach, i) => (
                  <div key={i} className="flex items-start gap-2.5 text-sm text-zinc-300 leading-normal">
                    <CheckCircle2 className="h-4 w-4 shrink-0 text-emerald-400 mt-0.5" />
                    <span>{ach}</span>
                  </div>
                ))}
              </div>

              {/* Tech Stack list - Clean unboxed text */}
              <div className="mt-6 pt-4 border-t border-white/[0.06]">
                <div className="flex flex-wrap items-center gap-x-2 gap-y-1 text-xs text-zinc-400">
                  <span className="text-zinc-400 font-medium">주요 활용 기술:</span>
                  {exp.techStack.map((tech, idx) => (
                    <React.Fragment key={tech}>
                      <span className="text-zinc-300">{tech}</span>
                      {idx < exp.techStack.length - 1 && (
                        <span aria-hidden="true" className="text-zinc-600">·</span>
                      )}
                    </React.Fragment>
                  ))}
                </div>
              </div>

            </div>
          ))}
        </div>

      </div>
    </section>
  );
};
