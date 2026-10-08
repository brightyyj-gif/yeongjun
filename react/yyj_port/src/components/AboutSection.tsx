import React, { useState } from 'react';
import { ChevronDown, Code, HeartHandshake, Compass } from 'lucide-react';

export const AboutSection: React.FC = () => {
  const [openFaq, setOpenFaq] = useState<number | null>(0);

  const faqs = [
    {
      q: '어떤 규모와 단계의 팀에 가장 크게 기여할 수 있나요?',
      a: '시리즈 A~C 단계에서 급성장하며 레거시 기술 부채를 해결하고, 디자인 시스템 및 프론트엔드 표준화가 필요한 팀에 가장 높은 임팩트를 제공합니다. 복잡한 비즈니스 로직을 명확한 아키텍처로 구조화하고 성능 지표를 가시적으로 개선합니다.'
    },
    {
      q: '백엔드 및 프로덕트 디자이너와의 협업 방식은 어떠한가요?',
      a: 'Figma 디자인 토큰 싱크 파이프라인과 Storybook을 통해 디자이너와 공통의 언어로 소통합니다. 백엔드와는 OpenAPI(Swagger) 또는 GraphQL 스키마를 선제적으로 협의하여 프론트엔드 모킹(MSW) 기반 병렬 개발을 진행해 출시 리드타임을 단축합니다.'
    },
    {
      q: '신규 프레임워크(React 19, RSC, Next.js App Router 등)의 도입 기준은 무엇인가요?',
      a: '트렌드에 편승하기보다 사용자 체감 성능(LCP, INP)과 팀의 유지보수 비용을 최우선으로 검토합니다. 점진적 마이그레이션 전략을 수립하고, 단위/E2E 테스트를 선행 구축하여 다운타임 없는 무중단 전환을 지향합니다.'
    }
  ];

  return (
    <section id="about" className="py-20 md:py-28 border-b border-white/[0.06] bg-[#0c0d12]">
      <div className="mx-auto max-w-7xl px-4 sm:px-6 lg:px-8">
        
        {/* Section Header */}
        <div className="pb-10 border-b border-white/[0.08]">
          <div className="text-xs font-mono uppercase tracking-widest text-indigo-400">
            06. Engineering Mindset & FAQ
          </div>
          <h2 className="mt-2 text-2xl sm:text-4xl font-extrabold text-white tracking-tight">
            기술을 넘어 프로덕트의 성공을 고민합니다
          </h2>
          <p className="mt-2 text-sm sm:text-base text-zinc-400 max-w-2xl">
            화면의 픽셀 하나부터 네트워크 패킷의 1바이트까지, 사용자 관점에서 집착하고 비즈니스 임팩트로 환산합니다.
          </p>
        </div>

        <div className="mt-12 grid grid-cols-1 lg:grid-cols-12 gap-12 items-start">
          {/* Left Column: Narrative */}
          <div className="lg:col-span-6 space-y-6 text-zinc-300 text-sm leading-relaxed">
            <p>
              안녕하세요. 브라우저라는 가장 대중적이고 인터랙티브한 캔버스 위에서 사용자 경험을 빚는 프론트엔드 엔지니어 <strong className="text-white">양영준</strong>입니다.
            </p>
            <p>
              컴퓨터공학을 전공하며 브라우저 렌더링 파이프라인(DOM/CSSOM 구축, 레이아웃, 페인트, 컴포지트)의 원리를 탐구했고, 수백만 사용자가 머무는 금융 및 엔터프라이즈 환경에서 그 원리를 실전 성능으로 검증해왔습니다.
            </p>
            <p>
              제가 가장 중요하게 생각하는 것은 <span className="text-indigo-400 font-medium">"체감 반응성"</span>과 <span className="text-indigo-400 font-medium">"팀의 지속 가능성"</span>입니다. 아무리 화려한 인터페이스도 0.1초의 버벅임이 있다면 사용자의 신뢰를 잃습니다. 또한, 아무리 빠른 출시도 아키텍처가 엉망이라면 미래의 속도를 갉아먹습니다.
            </p>

            <div className="pt-4 border-t border-white/[0.08] grid grid-cols-3 gap-4 font-mono">
              <div>
                <div className="text-xl font-bold text-white tabular-nums">15+</div>
                <div className="text-xs text-zinc-400 mt-0.5">배포된 프로덕션</div>
              </div>
              <div>
                <div className="text-xl font-bold text-white tabular-nums">100%</div>
                <div className="text-xs text-zinc-400 mt-0.5">타입 안전성 (TS)</div>
              </div>
              <div>
                <div className="text-xl font-bold text-white tabular-nums">0.02%</div>
                <div className="text-xs text-zinc-400 mt-0.5">크래시 무사고율</div>
              </div>
            </div>
          </div>

          {/* Right Column: Interactive FAQ Accordion */}
          <div className="lg:col-span-6 space-y-4">
            <h3 className="text-xs font-mono uppercase tracking-wider text-zinc-400 mb-2">
              자주 묻는 질문 (FAQ)
            </h3>
            {faqs.map((faq, index) => {
              const isOpen = openFaq === index;
              return (
                <div
                  key={index}
                  className="rounded-xl border border-white/[0.08] bg-[#12141c] overflow-hidden transition-colors"
                >
                  <button
                    onClick={() => setOpenFaq(isOpen ? null : index)}
                    className="w-full flex items-center justify-between p-4 text-left text-sm font-semibold text-white hover:text-indigo-300 transition-colors"
                  >
                    <span>{faq.q}</span>
                    <ChevronDown
                      className={`h-4 w-4 text-zinc-400 transition-transform duration-200 ${
                        isOpen ? 'rotate-180 text-indigo-400' : ''
                      }`}
                    />
                  </button>
                  {isOpen && (
                    <div className="px-4 pb-4 pt-1 text-xs text-zinc-300 leading-relaxed border-t border-white/[0.04] bg-white/[0.01]">
                      {faq.a}
                    </div>
                  )}
                </div>
              );
            })}
          </div>
        </div>

      </div>
    </section>
  );
};
